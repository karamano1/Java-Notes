import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//SimpleDate format is a concrete class for formatting and parsing date which inherits
		//java.text.Dateformat class
		//formating means converting date to string
		//parsing means converting string to date
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat foramtter = new SimpleDateFormat("dd/MM/yyyy"); //M-month,m-minute
		String strDate = foramtter.format(date);
		System.out.println(strDate);
		
		foramtter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = foramtter.format(date);
		System.out.println(strDate);
		
		foramtter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = foramtter.format(date);
		System.out.println(strDate);
		
		foramtter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = foramtter.format(date);
		System.out.println(strDate);
		
		foramtter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = foramtter.format(date);
		System.out.println(strDate);
		
		foramtter = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss z");
		strDate = foramtter.format(date);
		System.out.println(strDate);
		
		//Convert String into Date
		foramtter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = foramtter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
	}

}
