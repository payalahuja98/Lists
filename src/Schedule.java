import java.text.*;
public class Schedule {
	protected String activity;
	protected int hour;
	protected int min;
	
	DecimalFormat fmt = new DecimalFormat("00");
	
	public Schedule(String act, int hr, int mn){
		activity = act;
		hour = hr;
		min = mn;
	}
	public String getActivity(){
		return activity;
	}
	public void setActivity(String act){
		activity = act;
	}
	public int getHour(){
		return hour;
	}
	public void setHour(int hr){
		hour = hr;
	}
	public int getMin(){
		return min;
	}
	public String toString(){
		return activity + " " + hour + ":" + min;
	}
}
