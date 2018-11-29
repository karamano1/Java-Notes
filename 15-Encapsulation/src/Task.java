
public class Task {

	public static void main(String[] args) {
		TaskTemplate b1 = new TaskTemplate();
		b1.setAccountNumber("1231234234");
		b1.setBalance(2.5);
		b1.setCustomerName("Mike");
		
		b1.withrowal(100.0);
		b1.deposit(150.000);
		b1.withrowal(50);
		System.out.println(b1.getCustomerName());
		

	}

}
