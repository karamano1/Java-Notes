package LOOP;

import java.util.Arrays;

public class SixtenthAssignment {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));

	}
	/*public static int getEvenDigitSum(int number) {
		int sum=0;
		if(number<0) {
			return -1;
		}
		 String string = Integer.toString(number);
		  int[] digits = new int[string.length()];

		  for(int i = 0; i<string.length(); ++i){
		    digits[i] = Integer.parseInt(string.substring(i, i+1));
		  }
		  for(int a = 0;a<string.length();a++) {
			  if(digits[a]%2==0) {
				  sum+=digits[a];
			  }
		  }return sum;
	}*/
	public static int getEvenDigitSum(int number) {
		if(number<0) {
			return-1;
		}
		int sum = 0;
		while(number>0) {
			
			int digit =number%10;
			if(number%2==0) {
			sum+=digit;      
			}
			number =number/10; 
		}
		return sum;
		
	}

}
