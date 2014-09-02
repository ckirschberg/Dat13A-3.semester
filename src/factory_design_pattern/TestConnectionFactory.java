package factory_design_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConnectionFactory {

	@Test
	public void test() {
		//Arrange
		ConnectionFactory factory 
		= new ConnectionFactory("Oracle");
		
		
		
		//Act
		Connection oc = 
				factory.createConnection();
		
		
		//Assert
		assertEquals("Oracle failed","OracleConnection",oc.description());
		
		
	}

}
