import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class DayPlanner {
  public static void main(String[] args) throws FileNotFoundException{
	IndexedListInterface planner = new ArrayIndexedList();
	FileReader file = new FileReader("c:/Schedule.txt");
	Scanner input = new Scanner(file);
	
	String act = input.nextLine();
	int hr = input.nextInt();
	int mn = input.nextInt();
	while(input.hasNext()){
		input.nextLine();
		act = input.nextLine();
		hr = input.nextInt();
		mn = input.nextInt();
		planner.add(new Schedule(act, hr, mn));
	}

	System.out.println(planner.toString());
	planner = timeOrder((ArrayIndexedList) planner);
	System.out.println(planner.toString());
	
		
   }
   public static ArrayIndexedList timeOrder(ArrayIndexedList plan){
	   for(int i = 0; i < plan.size() - 1; i++){
		   if(((Schedule) plan.get(i)).getHour() > ((Schedule) plan.get(i + 1)).getHour()){
			   int temp = ((Schedule) plan.get(i)).getHour();
			   ((Schedule) plan.get(i)).setHour(((Schedule) plan.get(i + 1)).getHour());
			   ((Schedule) plan.get(i + 1)).setHour(temp);
			   
			   String tmp = ((Schedule) plan.get(i)).getActivity();
			   ((Schedule) plan.get(i)).setActivity(((Schedule) plan.get(i + 1)).getActivity());
			   ((Schedule) plan.get(i + 1)).setActivity(tmp);
			   
		   }
	   }
	   return plan;
   }
}