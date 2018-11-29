package EncapsulationAndConstructers;

public class Printer {
	private double tonerLevel;
	private int numberOfPagesPrinted;
	private boolean dublexPrinter;
	public void putToner(double TonerLimit) {
		this.tonerLevel+=TonerLimit;
	}
	
	public void Printer(boolean dublexPrinter) {
		this.dublexPrinter = dublexPrinter;
	}

	public void pageprinted(double pagePrinted) {
		if(this.dublexPrinter==true) {
			this.tonerLevel = this.tonerLevel;
				if(this.tonerLevel-pagePrinted<0) {
				   System.out.println("Only " + this.tonerLevel+ " availble. Toner no processed");
				}else {
				   this.tonerLevel-=pagePrinted/2;
				   System.out.println("number of "+ pagePrinted+" printeed.Remanning print limit is :" +this.tonerLevel);
				}
		}
		if(this.dublexPrinter==false) {
			if(this.tonerLevel-pagePrinted<0) {
			System.out.println("Only " + this.tonerLevel+ " availble. Withdrawal no processed");
			}else {
			this.tonerLevel-=pagePrinted;
			System.out.println("number of "+ pagePrinted+" printeed.Remanning print limit is :" +this.tonerLevel);
			}
		}
	}
	public double getTonerLevel() {
		return tonerLevel;
	}
	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}
	public boolean isDublexPrinter() {
		return dublexPrinter;
	}
	

}
