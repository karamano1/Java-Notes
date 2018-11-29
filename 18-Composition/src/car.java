public class car {
	
	private String color;
	private int maxSpeed;
	
	public void carInfo() {
		System.out.println("car color: " + color + " ,Car maxspeed: " + maxSpeed);
	}
	
	public car(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	
	
	

}