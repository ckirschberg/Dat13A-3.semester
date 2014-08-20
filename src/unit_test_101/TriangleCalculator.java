package unit_test_101;

public class TriangleCalculator {
	
	public double calculateHypot(double a, double b)
	{
		if (a <= 0) {
			throw new NumberFormatException("a is invalid. Should be larger than 0");
		}
		if (b <= 0) {
			throw new NumberFormatException("b is invalid. Should be larger than 0");
		}
		
		return Math.sqrt(a*a + b*b);
	}
}
