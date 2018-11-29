package EncapsulationAndConstructers;

public class MainVipClass {

	public static void main(String[] args) {
		VipCustomer v= new VipCustomer();
		VipCustomer v1 = new VipCustomer("Fetih ", 500000, " fethullahkahraman7");
		
		System.out.println(v1.getName()+v1.getCreditLimit()+v1.getEmailAddress());
		VipCustomer v2 = new VipCustomer("semih", 300000);
		System.out.println("your name is " + v2.getName()+" and your new email addres is "+v2.getEmailAddress()+" your credit card limit is "+v2.getCreditLimit());

	}

}
