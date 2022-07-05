package udhao;


public class Car {
	
	private double fareCar;
	private double baseFare = 50;
	private double distanceFare;
	private double timeFare;
	private double totalFare;
	private double promoFare;
	private double OnlineCut = 0;
	private double speed = 60;
	private double time;

	public double getBaseFare() {
		return baseFare;
	}

	public double getDistanceFare() {
		return distanceFare;
	}

	public double getTimeFare() {
		return timeFare;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public double getPromoFare() {
		return promoFare;
	}

	public double getOnlineCut() {
		return OnlineCut;
	}

	public Car(double dist, String Offer, String online) {
		fareCar = this.baseFare;
		fareCar = fareCar + (dist*25);
		this.distanceFare = (dist *25);
		this.time = dist/speed;
		fareCar = fareCar + (120 * time);
		this.timeFare = 120*time;
		this.totalFare = fareCar;
		Promotion promotion = new Promotion();
		fareCar = promotion.fareP(Offer, fareCar);
		this.promoFare = fareCar;
		if (online.equals("Yes")) {
			OnlineCut = promoFare *.1;
			fareCar = fareCar - OnlineCut;
		}
		else {
			OnlineCut = 0;
		}
		
		
	}
void bill() {
		
		System.out.println("Grand total fare: " + this.fareCar + "taka");
	}
	
	
}
