package repetition;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productId;
	private String name;
	private double price;
	private int quantity;
	
	public Product(){
		
	}
	
	public Product(int productId, String name, double price, int quantity)
	{
		this.productId = productId;
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity >= 0)
			this.quantity = quantity;
		else
			throw new IllegalArgumentException();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int id) {
		this.productId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
