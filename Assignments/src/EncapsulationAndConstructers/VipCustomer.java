package EncapsulationAndConstructers;

public class VipCustomer {
	private String name;
	private long creditLimit;
    private String EmailAddress;
	public VipCustomer(String name, long creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		EmailAddress = emailAddress;
	}
	public VipCustomer(String name,long creditLimit) {
		this.name = name;
		this.creditLimit = creditLimit;
		EmailAddress = this.name+"@gmail.com";
	}
	public VipCustomer() {
		System.out.println("Please define your information");
	}
	public String getName() {
		return name;
	}
	public long getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
    
}
