
public class Package implements Comparable<Package>{
	
	int id;
	boolean complete;
	RefSortedList<Fragment> data = new RefSortedList<Fragment>();
	int length;
	
	public Package(int i, Fragment d)
	{
		id = i;
		complete = false;
		data.add(d);
		if(d.getEnd() > length)
		{
			length = d.getEnd() + 1;
		}
	}
	
	public int getID()
	{
		return id;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public boolean isComplete()
	{
		data.reset();
		
		ifLoop:
		if(data.getNext().getStart() == 0)
		{
			Fragment test = data.getNext();
			
			for(int count = 0; count < data.size(); count++)
			{
				Fragment nextTest = data.getNext();
				
				//System.out.println(nextTest.getEnd() + 1 + " " + test.getStart());
				if(nextTest.getEnd() + 1 < test.getStart() && data.size() > 1)
				{
					break ifLoop;
				}
				
				if(!test.isMore())
				{
					completeMe();
				}
			}
		}
		return complete;
	}
	
	public void completeMe()
	{
		complete = true;
	}
	
	public RefSortedList<Fragment> getData()
	{
		return data;
	}
	
	public void addData(Fragment d)
	{
		data.add(d);
		if(d.getEnd() > length)
		{
			length = d.getEnd() + 1;
		}
	}
	
	public void setData(RefSortedList<Fragment> d)
	{
		data = d;
	}
	
	public int compareTo(Package t)
	{
		return id - t.getID();
	}

}
