import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//int number = scanner.nextInt();
		int sum = 0;
		int counter = 1;
		while(counter<11) {
			System.out.println("enter the #"+counter+": ");
			boolean bool = scanner.hasNextInt();
			if(bool==true) {
				counter++;
				int number = scanner.nextInt();
				sum+=number;
			}else {
				System.out.println("Invalid number");
			}
			scanner.nextLine();			//int number = scanner.nextInt();
			//sum+=number;
			
			
		}
		System.out.println(sum);
		scanner.close();
		

	}

}
