package repetition;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
	public static void main(String[] s)
	{
		//ArrayList<String> strings = new ArrayList<String>();
		//strings.add("Per");
		//strings.add("Helle");
		//strings.add("Hans");
//		
		//int age = 22;
		//String name = "Per";
//		Boolean b = true;
		boolean b2 = true;
//		
		
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(strings);
//		System.out.println(b);
		System.out.println(b2);
//		System.out.println("-----------------------");
		
		//changeAge(age);
		//changeName(name);
		//changeNames(strings);
//		changeToFalse(b);
		changeToFalse2(b2);
//		
		//System.out.println(age);
		//System.out.println(name);
		//System.out.println(strings);
//		System.out.println(b);
		System.out.println(b2);
//		
		
		
		
		ArrayList<Product> ps = new ArrayList<Product>();
		ps.add(new Product(1, "A", 10, 1));
		ps.add(new Product(1, "b", 1, 1));
		ps.add(new Product(1, "c", 5, 1));
		ps.add(new Product(1, "d", 7, 1));
		ps.add(new Product(1, "e", 2, 1));
	
		Collections.sort(ps);
		
		for(Product p : ps)
		{
			System.out.println(p.getName() + " " + p.getPrice());
		}
	}
	
	
	public static void changeAge(int age)
	{
		age = 5;
	}
	
	public static void changeName(String name)
	{
		name = "Sissel";
	}
	
	public static void changeNames(ArrayList<String> strings)
	{
		strings.add("John");
	}
	public static void changeToFalse(Boolean bool)
	{
		bool = false;
	}
	public static void changeToFalse2(boolean bool)
	{
		bool = false;
	}
}
