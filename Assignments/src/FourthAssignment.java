
public class FourthAssignment {

	public static void main(String[] args) {
	 
		System.out.println(bark(true,1));
		System.out.println(bark(false,2));
		System.out.println(bark(true,8));
		System.out.println(bark(true,-1));

	}
	public static boolean bark(boolean barking,int time) {
		if(barking==true && time<8 && time>0) {
			barking =true;
		}else {
			barking = false;
		}
	return barking;
	}

}
