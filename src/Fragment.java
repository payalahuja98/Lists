
public class Fragment implements Comparable<Fragment>{
	
	int id;
	int start;
	int length;
	int end;
	boolean more;
	
	public Fragment(int i, int s, int l, boolean m)
	{
		id = i;
		start = s;
		length = l;
		end = s + l - 1;
		more = m;
	}
	
	public int getID()
	{
		return id;
	}
	
	public int getStart()
	{
		return start;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getEnd()
	{
		return end;
	}
	
	public boolean isMore()
	{
		return more;
	}
	
	public int compareTo(Fragment t)
	{
		//System.out.println(t.getStart() + " " + start);
		return start - t.getStart();
	}

}
