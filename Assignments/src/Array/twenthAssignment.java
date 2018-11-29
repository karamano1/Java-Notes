package Array;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class twenthAssignment {

	public static void main(String[] args) {
		int a = 0;
		int fillArray[] = new int[6];
		int myArray[]= {2,4,5,6,7,6};
		for(int i = myArray.length-1 ;i>=0;i--) {
			fillArray[a++]=myArray[i];
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(fillArray));
		
		
		
	}
	public static int[] reverse(int[] array) {
		int a = 0;
		int fillArrays[] = new int[6];
		for(int i = array.length-1 ;i>=0;i--) {
			fillArrays[a++]=array[i];
		}
		return fillArrays;
		
		
		
	}

}
