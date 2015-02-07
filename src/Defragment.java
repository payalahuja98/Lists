
public class Defragment<T> {

	RefSortedList<Package> packList = new RefSortedList<Package>();
	public String status;
	
	public Defragment()
	{
		status = new String();
	}
	
	public void addFrag(int i, int s, int l, boolean m)
	{
		packList.reset();
		
		for(int count = 0; count < packList.size(); count++)
		{
			Package checkID = packList.getNext();
			
			if(checkID.getID() == i)
			{
				checkID.addData(new Fragment(i, s, l, m));
				return;
			}
		}
		Package hold = new Package(i, new Fragment(i, s, l, m));
		packList.add(hold);		
	}
	
	public String toString()
	{
		packList.reset();
		
		for(int count = 0; count < packList.size(); count++)
		{
			Package checkComp = packList.getNext();
			
			if(checkComp.isComplete())
			{
				status = status + "Packet " + checkComp.getID() + ", " + (checkComp.getLength()) + "\n";
			}
		}
		
		return status;
	}
}

