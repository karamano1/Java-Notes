package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NineteenthAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number");
		int i1= scanner.nextInt();
		System.out.println(i1);
		int[] myIntegers = getIntegers(i1);
		
		System.out.println(Arrays.toString(myIntegers));
		int min = 0;
		for(int i=0;i<myIntegers.length-1;i++) {
			if(myIntegers[i]<myIntegers[i+1]) {
				min = myIntegers[i];
			}
		}
		System.out.println("that`s min number " +min);
		int count = 0;
		for(int i=0;i<myIntegers.length;i++) {
			count++;
		}
		System.out.println("counter is "+ count);
		

	}
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter "+number+" integer values");
		int[] values = new int[number];
		for(int i =0;i<values.length;i++) {
			values[i]= scanner.nextInt();
		}
		return values;
	}

}
