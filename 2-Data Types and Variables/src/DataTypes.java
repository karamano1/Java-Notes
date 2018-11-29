
public class DataTypes {

	public static void main(String[] args) {
		//byte
		byte b1 = 25;
		byte b2= -128;
		byte b3= 127;
		System.out.println(b1+"|"+b2+"|"+b3);
		//byte b4=128; it gives error because it is out of the limit
		System.out.println("-------------");
		//short
		short s1 = 500;
		short s2 = -32768;
		short s3 = 32767;
		//short s4 = 32768;
		System.out.println(s1+"|"+s2+"|"+s3);
		System.out.println("--------------");
		//int
		int i1 = -50000;
		int i2 = 100_000;
		int i3 = 50000;
		System.out.println(i1+"|"+i2+"|"+i3);
		System.out.println("--------------");
		//long
		long l1 = 1453;
		long l2 = 100_000_000;
		long l3 = 212324234234531L;
		System.out.println(l1+"|"+l2+"|"+l3);
		//float:floating point types have double as default type
		float f1=5.2f;
		double d1 = 5.2;
		System.out.println(f1+"|"+d1);
		//boolean
		boolean bool=true;
		boolean bool2=false;
		//char
		char c1 = 'D';
		char c2 = '2';
		char c3 = '@';

	}

}
