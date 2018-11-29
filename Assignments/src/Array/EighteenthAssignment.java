package Array;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EighteenthAssignment {

	public static void main(String[] args) {
		int a =0;
		int[] myIntArray = new int[5];
		int[] myIntegers = getIntegers(5);
		Arrays.sort(myIntegers);
		System.out.println("Minimum = " + myIntegers[0]);
		System.out.println("Maximum = " + myIntegers[myIntegers.length-1]);
		for(int i = myIntegers.length-1;i>=0;i--) {
			System.out.println(myIntegers[i]);
			myIntArray[a++] = myIntegers[i];
		}
		System.out.println(Arrays.toString(myIntegers));
		
		System.out.println(Arrays.toString(myIntArray));

	}
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter"+number+" integer values");
		int[] values = new int[number];
		for(int i =0;i<values.length;i++) {
			values[i]=scanner.nextInt();
			
		}
		return values;
	}
	

}
