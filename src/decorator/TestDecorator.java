package decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDecorator {

	@Test
	public void test() {
		Computer computer = new Computer();
		computer = new Disk(computer);
		computer = new Monitor(computer);
		
		//act
		String result = computer.description();
		
		assertEquals("Description fails", "You bought a computer and a disk and a monitor", result);
	}

}
