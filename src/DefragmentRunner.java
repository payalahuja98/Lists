import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

	public class DefragmentRunner{
		public static void main(String[] args) throws FileNotFoundException{
			
			FileReader file = new FileReader("FRAGMENTS.txt");
			Scanner input = new Scanner(file);
			boolean more;
			Defragment defrag = new Defragment();

			while(input.hasNext()){
				int id = input.nextInt();
				int offset = input.nextInt();
				int length = input.nextInt();
				if (input.nextInt() == 1)
					more = true;
				else
					more = false;
				
				defrag.addFrag(id, offset, length, more);
				//System.out.println("id"+ id + " offset " + offset + " length" + length + " more" + more);
			}
			
			System.out.println(defrag.toString());

		}


			
	
}
