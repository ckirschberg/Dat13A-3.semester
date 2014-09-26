package set;

public class MySet<T> {
	private T[] tArray;
	private int position = 0;
	
	public MySet(int size)
	{
		tArray = (T[])new Object[size];
	}
	
	public boolean isEmpty()
	{
		return false;
	}
	//Determines whether a set is empty

	public int size()
	{
		return position;
	}
	//Returns the number of elements in this set

	public void add(T item)
	{
		tArray[position] = item;
		position++;
	}
	//Adds the specified element to this set if it is not already present

	private void updateArraySize()
	{
		//T[] newTs = (T[]) new Object[];
		
	}
	
	public boolean contains(T item)
	{
		return false;
	}
	//Determines if this set contains the specified item

	public MySet<T> union(MySet<T> other)
	{
		return null;
	}
	//Create a new set of elements that appears in both this and the other set.

	public MySet<T> intersection(MySet<T> other)
	{
		return null;
	}
	//Creates a new set of elements that in this set but not the other set.

	public void removeAll()
	{
		
	}
	//Removes all of the items in the set.
}
