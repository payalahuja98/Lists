

import hold.ListInterface;

public class RefUnsortedList<T> implements ListInterface<T> {

	protected int numElements;
	protected DSLLNode<T> currentPos;
	protected boolean found;
	protected DSLLNode<T> location;
	protected DSLLNode<T> previous;
	protected DSLLNode<T> list;
	
	public RefUnsortedList()
	{
		numElements = 0;
		list = null;
		currentPos = null;
		
	}

	
	protected void find(T target)
	{
		location = list;
		previous = null;
		found = false;
		
		while(location != null)
		{
			if(location.getInfo().equals(target))
			{
				found = true;
				return;
			}
			else
			{
				previous = location;
				location = location.getLink();
			}
		}
	}
	
	public int size() 
	{
		 
		return numElements;
	}

	 
	public void add(T element)
	{
		 
		DSLLNode<T> newNode = new DSLLNode<T>(element);
		newNode.setLink(list);
		list = newNode;
		numElements++;
	}

	 
	public boolean contains(T element)
	{
		find(element);
		return found;
	}

	 
	public boolean remove(T element)
	{
		find(element);
		
		if(found)
		{
			if(list == location)
			{
				list = list.getLink();
			}
			else
			{
				previous.setLink(location.getLink());
			}
			
			numElements--;
		}
		
		return found;
	}

	 
	public T get(T element)
	{
		find(element);
		if(found)
		{
			return location.getInfo();
		}
		else
		{
			return null;
		}
	}
	
	public String toString()
	{
		DSLLNode<T> currNode = list;
		String listString = "List:\n";
		while(currNode != null)
		{
			listString = listString + " " + currNode.getInfo() + "\n";
			currNode = currNode.getLink();
		}
		return listString;
	}

	 
	public void reset()
	{
		currentPos = list;		
	}

	 
	public T getNext()
	{
		T next = currentPos.getInfo();
		
		if(currentPos.getLink() == null)
		{
			currentPos = list;
		}
		else
		{
			currentPos = currentPos.getLink();
		}
		
		return next;
	}
}
