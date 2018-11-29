package LOOP;

public class FifteenthAssignment {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(227));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
	}
	public static int sumFirstAndLastDigit(int number) {
		if(number>=0) {
		int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
		int lasDigit = number%10;
		int sum = firstDigit+lasDigit;
		System.out.print("First digit " + firstDigit + " and the last is " + lasDigit + " which gives us " + firstDigit + " + " + lasDigit+ " and the sum is " );
		return sum;
		}
		System.out.print("because the parameter is negative ");
		return -1;
		
	}

}
