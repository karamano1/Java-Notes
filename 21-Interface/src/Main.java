
public class Main {

	public static void main(String[] args) {
		//DeskPhone mikePhone = new DeskPhone(202022202, true);
		ITelephone mikePhone = new DeskPhone(202002202, true);
		mikePhone.powerOn();
		mikePhone.callPhone(202002202);
		mikePhone.answer();

	}

}
