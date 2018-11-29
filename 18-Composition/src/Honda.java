
public class Honda  extends car{
	private engine engine;
	private int door;
	public Honda(String color, int maxSpeed,engine engine) {
		super(color, maxSpeed);
		this.engine=engine;
		
	}
	public void startHonda() {
		engine.start();
	}

	
	
}
