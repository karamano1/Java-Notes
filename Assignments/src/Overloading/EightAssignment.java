package Overloading;

public class EightAssignment {

	public static void main(String[] args) {
		getDurationString(67, 23);
		getDurationString(3600);

	}
	public static void getDurationString(int min,int sec) {
		if(min>=0&&sec>=0&&sec<=59) {
			int hour = min/60;
			int min1= min%60;
			System.out.println(hour+"h " + min1+"m " + sec + "s" );
		}else {
			System.out.println("false");
		}
	}
	public static void getDurationString(int sec) {
		if(sec>=0) {
			int min = sec/60;
			int sec1 = sec%60;
			System.out.println(min+"m "+sec1+"s");
		}else {
			System.out.println("Invalid value");
		}
	}
	

}
