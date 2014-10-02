package queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyQueue {
	
	MyQueue<String> stringQueue;
	
	@Before
	public void setUp()
	{
		stringQueue = new MyQueue<String>();
		
		stringQueue.enqueue("A");
		stringQueue.enqueue("B");
		stringQueue.enqueue("C");
		stringQueue.enqueue("D");
		stringQueue.enqueue("E");
	}
	
	@Test
	public void test_EnqueueDequeue() {
		
		assertEquals("A",stringQueue.dequeue());
		assertEquals("B", stringQueue.dequeue());
		assertEquals("C", stringQueue.dequeue());
		assertEquals("D", stringQueue.dequeue());
		assertEquals("E", stringQueue.dequeue());
	}
	
	public void test_Peek()
	{
		assertEquals("A",stringQueue.peek());
		assertEquals("A",stringQueue.peek());
	}

	
	
	//her testes både dequeueAll og isEmpty. En unit test burde teste kun en metode...
	public void test_DequeueAllAndIsEmpty()
	{
		stringQueue.dequeueAll();
		
		assertEquals(true, stringQueue.isEmpty());
		
	}

	
}
