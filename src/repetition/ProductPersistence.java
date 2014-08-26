package repetition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ProductPersistence implements IProductPersistence {

	@Override
	public void saveProducts(ArrayList<Product> products) {
		
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		try
        {
			File yourFile = new File(filePath + fileName);
			yourFile.createNewFile();
			
			fileOut = new FileOutputStream(filePath + fileName, false);
	       	out = new ObjectOutputStream(fileOut);
	         
   	   		out.writeObject(products);
	    }
		catch(IOException i)
	    {
	        i.printStackTrace();
	    }
		finally {
			try {
				out.close();
				fileOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<Product> loadAllProducts() throws Exception {
		ArrayList<Product> groups = new ArrayList<Product>();
	    
		FileInputStream fileIn = null;
		ObjectInputStream in = null;
		try
	    {
	       fileIn = new FileInputStream(filePath + fileName);
	       in = new ObjectInputStream(fileIn);
	       
    		   groups = (ArrayList<Product>) in.readObject();
	    }
		catch(IOException | ClassNotFoundException i)
	    {
	       throw new Exception("Could not load data");
	    }
		finally {
		    in.close();
		    fileIn.close();
		}
		return groups;
	}
}
