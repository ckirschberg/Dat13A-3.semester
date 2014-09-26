package generics;

import java.io.Serializable;

public class Horse implements Serializable {
	private String name;
	private double height;
	private String email;
	
	public Horse(String n, double h, String e)
	{
		name = n;
		height = h;
		email = e;
	}
}
