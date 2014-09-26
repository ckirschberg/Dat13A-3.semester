package queue;

public interface IQueue<T> {
	public boolean isEmpty();
	//Determines whether the queue is empty.

	public void enqueue(T t);
	//adds NewItem at the back of a queue

	public T dequeue();
	//retrieves and removes the front of a queue-the item that was added first.

	public void dequeueAll();
	//removes all items

	public T peek();
	//Retrieves the front of a queue. The queue is unchanged. (It does not remove the item from the queue).
}
