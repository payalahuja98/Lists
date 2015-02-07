import java.text.*;
public class Song {
	protected String name;
	protected int duration;
	
	DecimalFormat fmt = new DecimalFormat("00");
	public Song(String n, int s){
		name = n;
		duration = s;
	}
	public Song(String n, int m, int s){
		name = n;
		duration = (60 * m) + s;
	}
	public String getName(){
		return name;
	}
	public int getDuration(){
		return duration;
	}
	public String toString(){
		return (name + " " + (duration / 60) + ":" + fmt.format(duration % 60));
	}
}
