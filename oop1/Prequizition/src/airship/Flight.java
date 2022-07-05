package airship;

public class Flight {
	int altitude;
	int heading;
	int speed;
	float latitude;
	float longitude;
	void turnFlight(int angle) {
		heading = (heading+angle)%360;
		if(heading <0 ) {
			heading = heading + 360;
		}
		
		}
	
	void setHeading(int angle) {
		heading = angle % 360;
	if(heading<0) {
		heading = heading+360;
	}
	}
	int getHeading() {
		return heading;
	}
	void printFlight() {
		System.out.println(altitude+"/"+heading+"/"+speed);
	}
	
}
