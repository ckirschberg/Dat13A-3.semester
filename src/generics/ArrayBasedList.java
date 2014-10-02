package generics;

import java.io.Serializable;

public class ArrayBasedList<T extends Serializable> implements ListInterface<T> {
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
