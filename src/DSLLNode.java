

public class DSLLNode <T> implements Comparable<T>
{
	private T Info;
	private  DSLLNode<T> next;
	
	public DSLLNode (T Info)
	{
		this(Info, null);
	}
	
	public DSLLNode (T Info, DSLLNode <T> next)
	{
		this.Info = Info;
		this.next = next;
	}
	
	public void setInfo(T Info)
	{
		this.Info = Info;
	}
	
	public void setLink (DSLLNode < T> next)
	{
		this.next = next;
	}
	
	public T getInfo()
	{
		return this.Info;
	}
	
	public DSLLNode<T> getLink()
	{
		return this.next;
	}
	
	public int compareTo(T t)
	{
		return ((Comparable<T>) getInfo()).compareTo(t);
	}
	
}


