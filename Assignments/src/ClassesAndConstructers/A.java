package ClassesAndConstructers;

public class A {
	public String str;
	public double val;
	
	

	public void print() {
		if(str==null) {
			str="JAVA";
		}
		System.out.println("str: " + str + " ,val:" + val);
	}
	public void print(String str) {
		System.out.println("str: " + str + " ,val:" + val);
	}
	public void print(double val) {
		if(str==null) {
			str="JAVA";
		}
		System.out.println("str: " + str + " ,val:" + val);
	}
	public void print(String str,double val) {
		System.out.println("str: " + str + " ,val:" + val);
	}
	
}
