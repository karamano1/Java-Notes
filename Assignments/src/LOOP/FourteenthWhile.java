package LOOP;



	/*public static void main(String[] args) {
		//System.out.println(isPalindrome(707));
		//System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(0));
	}
	

	
	public static boolean isPalindrome(int number) {
		boolean set = true;
		while(set) {
			System.out.println("basladim");
			int reserve = 0;
			int lastDigit=number%10;
			reserve++;
			reserve = reserve*10;
			reserve+=lastDigit;
			number = number/10;
			System.out.println(number);
			if(number!=0||number>0) {
				set = false;
				System.out.println("ciktim");
			}
			
			
			return true;
		}
		return false;
	}

}*/
	import java.util.*;
	 
	public class FourteenthWhile 
	{
	   public static void main(String args[])
	   {
	      String original, reverse = ""; // Objects of String class
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	         
	   }
	} 
