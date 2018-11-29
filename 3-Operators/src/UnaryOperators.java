
public class UnaryOperators {

	public static void main(String[] args) {
		int i=10;
		int j=5;
		i++;
		--j;
		System.out.println(i+"|"+j);
		int res = i++ + --j;
		System.out.println(res+"|"+i+"|"+j);
		boolean flag=true;
		System.out.println((!flag));
		System.out.println(!!flag);

	}

}
