public class CRefUnsortedList<T> implements ListInterface<T> {
	
	protected int numElements = 0;
	protected LLNode<T> curPos;
	protected LLNode<T> list;
	protected LLNode<T> prev;
	protected LLNode<T> location; 
	protected boolean found;
	
	public void reset() {
		if(list != null){
			curPos = list.getLink();
		}
	}
	
	public int size() {
		return numElements;
	}

	
	public void add(T element) {
		LLNode<T> newNode = new LLNode<T>(element);
		if(list == null){
			list = newNode;
			newNode.setLink(list);
		}
		else{
			newNode.setLink(list.getLink());
			list.setLink(newNode);
			list = newNode;
		}
		numElements++;
	}

	protected boolean find(T element){
		location = list;
		found = false;
	  if(list != null){
		do{
			prev = location;
			location = list.getLink();
			if(location.getInfo().equals(element)){
				found = true;
			}
		}
		while((location != null) && (found == false));
	  }
		return found;
	}
	
	public boolean contains(T element) {
		found = find(element);
		return found;
	}

	public T get(T i) {
		found = find(i);
		if(found){
			return location.getInfo();
		}
		return null;
	}
	
	public boolean remove(T element) {
		found = find(element);
		if(found){
			if(list == list.getLink()){
				list = null;
			}
			else{
			  if(prev.getLink() == list){
				list = prev;
			  }
			  prev.setLink(location.getLink());
			  numElements--;
			}
		}
		return found;
	}

	public T getNext() {
		T next = curPos.getInfo();
		curPos = curPos.getLink();
		return next;
	}
	
	public String toString(){
		String listString = "List: " + "\n";
		if(list != null){
			prev = list;
			do{
				listString += " " + prev.getLink().getInfo() + "\n";
				prev = prev.getLink();
				
			}
			while(prev != list);
		}
		return listString;
	}

}
