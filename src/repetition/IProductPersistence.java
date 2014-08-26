package repetition;

import java.util.ArrayList;

public interface IProductPersistence {
	//note: the constants defined in the interface here.
	public static final String filePath = "C:\\Users\\Desktop\\Desktop\\";
	public static final String fileName = "product.ser";
	
	public void saveProducts(ArrayList<Product> products);
	public ArrayList<Product> loadAllProducts() throws Exception;
}
