package generics;

public class ArrayBasedList<T> implements ListInterface<T> {
	T[] t = (T[])new Object[100];
	
	@Override
	public T get(int index) {
		return t[index];
	}

	@Override
	public void remove(int index) {
		
	}

	@Override
	public void add(int i, T item) {
		t[i] = item;
	}
}
