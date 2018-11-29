
public class EncapsulationClass {

	public static void main(String[] args) {
		
		carTemplate mercedes = new carTemplate();
		//mercedes.setDoors("4");
		mercedes.setModel("911");//we put condition other options wont accaptable.
		String Model = mercedes.getModel();
		System.out.println(Model);
		

	}

}
