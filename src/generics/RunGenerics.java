package generics;

public class RunGenerics {
	public static void main(String[] kale)
	{
		//ArrayList<Product> strings = new ArrayList<Product>();
		
		ArrayBasedList<Horse> horses = new ArrayBasedList<Horse>();
		horses.add(0, new Horse("Kale", 1.5, "kale@horseranch.com"));
		horses.add(0, new Horse("Nicolaj", 2.9, "nicolaj@horseranch.com"));
		
		
	}
}
