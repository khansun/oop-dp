package vehicle;

class Vehicle {
	private int wheel;
	private String colour, fuel;
	protected double speed;
	
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getSpeed() {
		return speed;
	}

	protected void setSpeed(double speed) {
		this.speed = speed;
	}

	void start()
	{
		System.out.println("Ignition!");
		
	};
	void accelerate() {
		System.out.println("Ka Chaw!");
	}
	;
	 void brake() {
		 System.out.println("Ashphalt");
	 };
}
