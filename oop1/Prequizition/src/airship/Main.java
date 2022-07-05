package airship;

public class Main {
	public static void main(String [] args) {
		
		CommercialFlight incomingComFlight = new CommercialFlight();
		Flight xflight = new Flight();
		incomingComFlight.altitude = 2500;
		incomingComFlight.setHeading(45);
		incomingComFlight.speed = 1500;
		incomingComFlight.flightNumber = 180;
		incomingComFlight.passengers = 25;
		incomingComFlight.printFlight();
		xflight.printFlight();
	}
}
