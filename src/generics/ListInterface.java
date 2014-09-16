package generics;

public interface ListInterface<T> {
	T get(int index);
	void remove(int index);
	void add(int i, T item);
}
