
public class TaskTemplate {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
	}
	public void withrowal(double withrowalAmount) {
		if(this.balance-withrowalAmount<0) {
			System.out.println("Only " + this.balance+ " availble. Withdrawal no processed");
		}else {
			this.balance-=withrowalAmount;
			System.out.println("whitroawal of "+ withrowalAmount+" proceed.Remanning ballance is :" +this.balance);
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
