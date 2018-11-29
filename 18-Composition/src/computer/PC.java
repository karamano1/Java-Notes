package computer;

public class PC {
	private Case theCase;
	private Monitor theMonitor;
	private Motherboard theMotherBoard;
	public PC(Case theCase, Monitor theMonitor, Motherboard theMotherBoard) {
		super();
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherBoard = theMotherBoard;
	}
	public Case getTheCase() {
		return theCase;
	}
	public Monitor getTheMonitor() {
		return theMonitor;
	}
	public Motherboard getTheMotherBoard() {
		return theMotherBoard;
	}
	
}
