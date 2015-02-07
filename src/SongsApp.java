import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class SongsApp {
	public static void main(String[] args) throws FileNotFoundException{
		FileReader file = new FileReader("c:/SONGS.txt");
		Scanner input = new Scanner(file);
		
		int minutes;
		int seconds;
		IndexedListInterface song = new ArrayIndexedList();
		IndexedListInterface artist = new ArrayIndexedList();
		while(input.hasNext()){
			String name = input.nextLine();
			artist.add(input.nextLine()); 
			minutes = input.nextInt();
			seconds = input.nextInt();
			input.nextLine();
			song.add(new Song(name, minutes, seconds));
			
		}
		for(int i = 0; i < song.size(); i++){
			System.out.print("Song: " + song.get(i) + "    " + "Artist: " + artist.get(i) + "\n");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		artist = order(artist, song);
		
		for(int i = 0; i < song.size(); i++){
			System.out.print("Song: " + song.get(i) + "     " + "Artist: " + artist.get(i) + "\n");
		}
	}
	public static ArrayIndexedList order(IndexedListInterface artists, IndexedListInterface songs){
	  for(int j = 0; j < artists.size() - 1; j++){
		for(int i = 0; i < artists.size() - 1; i++){
		  if(artists.get(i).toString().charAt(0) > artists.get(i + 1).toString().charAt(0)){
			Object temp = artists.get(i);
			Object first = artists.get(i + 1);
			Object second = temp;
			artists.set(i,first);
			artists.set(i+1,second);
			temp = songs.get(i);
			first = songs.get(i + 1);	 
			second = temp;
			songs.set(i,first);
			songs.set(i+1,second);
			
			
		  }
		  if(artists.get(i).toString().charAt(0) == artists.get(i + 1).toString().charAt(0)){
			  if(songs.get(i).toString().charAt(0) > songs.get(i + 1).toString().charAt(0)){
				    Object temp = artists.get(i);
					Object first = artists.get(i + 1);
					Object second = temp;
					artists.set(i,first);
					artists.set(i+1,second);
					temp = songs.get(i);
					first = songs.get(i + 1);	 
					second = temp;
					songs.set(i,first);
					songs.set(i+1,second);
			  }
		  }
		}
	  }
		return (ArrayIndexedList) artists;
	}
	
}
