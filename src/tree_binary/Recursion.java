package tree_binary;

public class Recursion {
	public static void main(String[] args)
	{
		x(5);
		
	}
	
	
	public static void x(int number)
	{
		if (number == 0)
		{
			return;
		}
		else
		{
			System.out.println("Asking: Are you the last?" + number);
			x(number-1);
			System.out.println(number);
		}
	}
}









