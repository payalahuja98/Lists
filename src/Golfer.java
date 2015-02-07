public class Golfer implements Comparable<Golfer>{
	protected String name;
	protected int score;
	
	public Golfer(String n, int s){
		name = n;
		score = s;
	}
	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
	public int compareTo(Golfer other){
			if(score < other.getScore()){
				return -1;
			}
			else{
			   if(score == other.getScore()){
				   return 0;
			   }
			   else{
				   return 1;
			   }
				
			}
	}
	public String toString(){
		return (score +  " " + name);
	}
}
