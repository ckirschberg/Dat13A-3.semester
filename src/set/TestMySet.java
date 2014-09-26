package set;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMySet {

	@Test
	public void test() {
		MySet<String> strings = new MySet<String>(100);
		
		strings.add("A");
		strings.add("B");
		
		assertEquals(2, strings.size());
	}
	
	
	

}
