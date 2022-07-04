package udhao;

public class BiCycle {
	private	double fareCycle;
	private double baseFare = 20;
	private double distanceFare;
	private double timeFare;
	private double totalFare;
	private double promoFare;
	private double OnlineCut = 0;
	private double speed = 20;
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

	public BiCycle(double dist, String Offer, String online) {
		fareCycle = this.baseFare;
		fareCycle = fareCycle + (dist*10);
		this.distanceFare = (dist *10);
		this.time = dist/speed;
		fareCycle = fareCycle + (120 * time);
		this.timeFare = 120*time;
		this.totalFare = fareCycle;
		Promotion promotion = new Promotion();
		fareCycle = promotion.fareP(Offer, fareCycle);
		this.promoFare = fareCycle;
		if (online.equals("Yes")) {
			OnlineCut = promoFare *.1;
			fareCycle = fareCycle - OnlineCut;
		}
		else {
			OnlineCut = 0;
		}
		
		
	}
 void bill() {
		
		System.out.println("Grand total fare: " + this.fareCycle + "taka");
	}
	
	
}

