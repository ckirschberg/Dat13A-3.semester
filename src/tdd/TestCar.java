package tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCar {
	private Car car;
	
	@Before
	public void setUp()
	{
		//Arrange
		car = new Car();
	}
	
	@Test
	public void testSetHeight_validInput_Equals() {
		
		//act
		car.setHeight(0.5);
		
		//assert
		assertEquals("0.5 did not pass", 0.5, car.getHeight(), 0.1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSetHeight_invalidInput_Equals() {
		
		//act
		car.setHeight(0.45);
		
		//assert
		//assertEquals("0.45 did not pass", 0.5, car.getHeight(), 0.1);
	}
}
