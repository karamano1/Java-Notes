
public class firstAssignment {

	public static void main(String[] args) {
		double []  income = {300000000,150000000,20000000,1200000000};
		for(int i = 0;i<income.length;i++) {
		if(income[i]<=150000000) {
			double tax=(150000000*25)/100;
			System.out.println("your tax is with 25% "+tax);
		}else if(income[i]<=300000000) {
			double tax=300000000*25;
			System.out.println("your tax is "+tax);
		}else if(income[i]<=600000000) {
			long tax=(600000000*35)/100;
			System.out.println("your tax is "+tax);
		}else if(income[i]<=1200000000) {
			long tax=(1200000000*40)/100;
			System.out.println("your tax is "+tax);
		}else if(income[i]<=1200000000) {
			long tax=(1200000000*50)/100;
			System.out.println("your tax is "+tax);
		}
      }

	}

}
