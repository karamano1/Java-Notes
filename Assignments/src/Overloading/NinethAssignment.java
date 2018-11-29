/*Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.
If either or both parameters is/are negative return -1.0 to indicate an invalid value.*/
package Overloading;

public class NinethAssignment {

	public static void main(String[] args) {
		System.out.println(area(5.0));
		System.out.println(area(-1.0));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1.0,4.0));
	}
	public static double area(double radious) {
		if(radious>0) {
			double area1 = radious*radious *3.14159;
			return area1;
		}
		return -1.0;
	}
	public static double area(double x,double y) {
		if(x>0&&y>0) { 
		double area1 = x*y;
		return area1;
		}
		return -1.0;
	}
	
}
