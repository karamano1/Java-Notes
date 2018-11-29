import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter a byte value");
		byte b1=scanner.nextByte();
		System.out.println("My byte value is "+b1);
		System.out.println("Enter a short value");
		short s1 = scanner.nextShort();
		System.out.println("enter a int value");
		int i1= scanner.nextInt();
		System.out.println("enter a boolean");
		boolean b2=scanner.nextBoolean();
		System.out.println(b1+"|"+s1+"|"+i1+"|"+b2);*/
		System.out.println("enter a int value");
		int i1= scanner.nextInt();
		System.out.println(i1);
		scanner.nextLine();
		System.out.println("enter your name");
		String str = scanner.nextLine();
		System.out.println(str);
		}

}
