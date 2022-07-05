package airship;

public class CommercialFlight extends Flight {
		//extra members in coommercial flight
	int flightNumber;
	int passengers;
	//override
	void printFlight() {
		System.out.println("Flight"+ flightNumber+" ");
	super.printFlight();
	}

}
