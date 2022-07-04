package vehicle;

public class Main {
	public static void main(String args[]) {
		
		Truck ass = new Truck();
		ass.setWheel(12);
		Bike ducatti = new Bike();
		ducatti.setSeats(2);
		ducatti.setSaddle(21.55978);
		ducatti.setWheel(2);
		ducatti.setSpeed(400);
		ducatti.setFuel("Octane");
		ducatti.setColour("Red");
		
		Car bmw = new Car();
		bmw.setSeats(4);
		System.out.println("BMW has: " + bmw.getSeats());
		System.out.println("Truck has: " + ass.getWheel());
		ducatti.start();
		System.out.println("Ducatti has" + ducatti.getSeats());
		System.out.println("Ducatti has" + ducatti.getSaddle());
		System.out.println("Ducatti has speed of" + ducatti.getSpeed()+"kmh" );
		System.out.println("Ducatti has" + ducatti.getWheel()+"Wheels" );

	}
}
