package computer;

public class Main {

	public static void main(String[] args) {
		Dimensions theDimensions = new Dimensions(20,20,5);
		Case theCase=new Case("2208","Dell","240",theDimensions);
		Motherboard theMotherBoard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");
		Monitor theMonitor = new Monitor("27inc beast", "Acer", 27, new Resolution(2540,1440));
		
		PC thePC = new PC(theCase,theMonitor,theMotherBoard);
		thePC.getTheMonitor().drawPixelAt(1500,1200,"Red");
		thePC.getTheMotherBoard().loadProgram("windows 1.0");
		thePC.getTheCase().pressPowerButton();
	}

}
