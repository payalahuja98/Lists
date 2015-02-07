public class ArrayIndexedList<T> extends ArrayUnsortedList<T> implements IndexedListInterface<T>{
	public ArrayIndexedList(){
		super();
	}
	public ArrayIndexedList(int oc){
		super(oc);
	}
	public void add(int index, T element){
		if((index < 0) || (index > size())){
			throw new IndexOutOfBoundsException("illegal index of " + index + " passed to ArrayIndexedList add method.\n");
		}
		if(numElements == list.length){
			enlarge();
		}
		for(int i = numElements; i > index; i--){
			list[i] = list[i - 1];
		}
		list[index] = element;
		numElements++;
	}
	public T set(int index, T element){
		if((index < 0) || (index >= size())){
			throw new IndexOutOfBoundsException("illegal index of " + index + " passed to ArrayIndexedList set method.\n");
		}
		T hold = list[index];
		list[index] = element;
		return hold;
	}
	public T get(int index){
		if((index < 0) || (index >= size())){
			throw new IndexOutOfBoundsException("illegal index of " + index + " passed to ArrayIndexedList get method.\n");
		}
		return list[index];
	}
	public int indexOf(T element){
		find(element);
		if(found){
			return location;
		}
		return -1;
	}
	public T remove(int index){
		if((index < 0) || (index >= size())){
			throw new IndexOutOfBoundsException("illegal index of " + index + " passed to ArrayIndexedList remove method.\n");
		}
		T hold = list[index];
		list[index] = null;
		for(int i = numElements - 1; i > index; i--){
			list[i] = list[i - 1];
		}
		list[numElements - 1] = null;
		numElements--;
		return hold;
	}
	public String toString(){
		String listString = "List:\n";
		for(int i = 0; i < numElements; i++){
			listString = listString + "[" + i + "] " + list[i] + "\n";
		}
		return listString;
	}
}
