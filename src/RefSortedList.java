public class RefSortedList<T extends Comparable<T>> extends RefUnsortedList<T> 
							 		implements ListInterface<T> {
	public RefSortedList(){
		super();
	}
	

public class RefSortedList<T extends Comparable<T>> extends RefUnsortedList<T> implements ListInterface<T>
{
	public RefSortedList()
	{
		super();
	}
	
	public void add(T element)
	{
		DSLLNode<T> prevLoc;
		DSLLNode<T> location;
		T listElement;
		
		location = list;
		prevLoc = null;
		
		while(location != null)
		{
			listElement = location.getInfo();
			if(listElement.compareTo(element) < 0)
			{
				prevLoc = location;
				location = location.getLink();
			}
			else
			{
				break;
			}
		}
		
		DSLLNode <T> newNode = new DSLLNode<T>(element);
		
		if(prevLoc == null)
		{
			newNode.setLink(list);
			list = newNode;
		}
		else
		{
			newNode.setLink(location);
			prevLoc.setLink(newNode);
		}
		
		numElements++;
	}
}
}