
public class ThirdAssignment {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);
		printMegaBytesAndKiloBytes(4050);

	}
	public static void printMegaBytesAndKiloBytes(int Kilobytes) {
			
			int a  = Kilobytes/1024;
			int kilobyte= Kilobytes%1024;
			System.out.println(Kilobytes + " KB " + "="+a+" MB and "+kilobyte+" KB");
	}

}
