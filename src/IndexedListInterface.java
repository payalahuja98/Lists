public interface IndexedListInterface<T> extends ListInterface<T> {
	void add(int index, T element);
	T set(int index, T element);
	T get(int index);
	int indexOf(T element);
	T remove(int index);
}
