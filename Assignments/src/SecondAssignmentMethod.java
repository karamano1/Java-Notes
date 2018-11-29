
public class SecondAssignmentMethod {

	public static void main(String[] args) {
		isCatPlaying(true, 10);
		isCatPlaying(false, 36);
		isCatPlaying(false, 35);

	}
	public static void isCatPlaying(boolean summer,int weather) {
		if(summer==true && weather<=45 && weather>35) {
			System.out.println("true");
		}else if(summer==false && weather<=35 && weather>25){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
