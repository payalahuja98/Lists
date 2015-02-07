import java.util.Scanner;
public class GolfApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Golfer g;
		ListInterface<Golfer> golfers = new ArraySortedList<Golfer>();
		while(!(input.nextLine().equals("DONE"))){
			String name = input.nextLine();
			int score = input.nextInt();
			input.nextLine();
			g = new Golfer(name,score);
			golfers.add(g);
		}
		System.out.println(golfers);
	}
}
