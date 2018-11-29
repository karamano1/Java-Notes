package UserInput;

import java.util.Scanner;

public class SeventeethAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loop=true;
		int min = 0;
		int max = 0;
		
		while(loop) {
			System.out.println("enter your number");
			int i1= scanner.nextInt();
			System.out.println(i1);
			
			if(max<i1) {
				max = i1;
			}else if(min>i1) {
				min=i1;
			}
			
			if(i1<0) {
				loop = false;
			}
		}
		System.out.println(min + " " + max);
	}
	
	

}
