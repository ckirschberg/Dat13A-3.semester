package repetition;
import java.util.ArrayList;

public class ProductCtrl {

	//ProductPersistance pSer = new ProductPersistence(); //tightly coupled
	IProductPersistence pSer; //loosely coupled
	private ArrayList<Product> products = null;
	
	public ProductCtrl(IProductPersistence ipp)  //loosely coupled
	{
		pSer = ipp;
		try {
			products = loadProducts();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Product> loadProducts() throws Exception
	{
		return pSer.loadAllProducts();
	}
	
	public ArrayList<Product> findProductsByName(String name)
	{
		return null;
		//
		//1: Unit test - som afprøver denne metode
		//1a: Brug mockito - send et mock objekt ind og sæt det op således at
		// det returnerer en bestemt ArrayList<Product>
		// Definer selv arraylisten i unit testen.
		//2: Implementer metoden
		
	}
	
}

