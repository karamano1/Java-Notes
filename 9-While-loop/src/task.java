
public class task {

	public static void main(String[] args) {
		System.out.println(sumDisgits(125));
		System.out.println(sumDisgits(-125));
		System.out.println(sumDisgits(32125));

	}
	public static int sumDisgits(int number) {
		if(number<10) {
			return -1;
		}
		int sum = 0;
		while(number>0) {
			int digit =number%10; //125%10 =5   //12%10=2   1%10=1
			sum+=digit;           //5+0=5       //2+5=7     7+1=8
			number =number/10;    //125/10=12   //12/10=1   1/10=0 so it is int means 0 0=0 is wrong its break;
		}
		return sum;
	}

}
