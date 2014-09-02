package strategy_design_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategry {

	@Test
	public void test() {
		IGoAlgorithm igo = new GoByDriving();
		
		Car car1 = new Car(igo);
		
		String transportMethod = car1.go();
		
		assertEquals("Driving fails", "Driving", transportMethod);
		
		car1.setAlgo(new GoByFlying());
		
		assertEquals("Flying fails", "Flying", car1.go());
		
	}

}
