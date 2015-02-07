public interface ListInterface<T> {
	int size();
	String toString();
	void add(T element);
	boolean contains(T element);
	boolean remove(T element);
	T get(T i);
	void reset();
	T getNext();
}
