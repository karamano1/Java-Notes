
public class SeventhAssignment {

	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));

	}
	public static boolean hasTeen(int first,int second,int third) {
		if(first>=13&&first<=19||second>=13&&second<=19||third>=13&&third<=19) {
			return true;
		}
		return false;
	}

}
