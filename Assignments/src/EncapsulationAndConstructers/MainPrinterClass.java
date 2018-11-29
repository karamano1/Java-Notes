package EncapsulationAndConstructers;

public class MainPrinterClass {

	public static void main(String[] args) {
		Printer p1 = new Printer();
		p1.putToner(100);
		p1.Printer(false);
		p1.pageprinted(30);
		p1.pageprinted(20);
		p1.pageprinted(60);
		Printer p2 = new Printer();
		p2.putToner(100);
		p2.Printer(true);
		p2.pageprinted(30);

	}

}
