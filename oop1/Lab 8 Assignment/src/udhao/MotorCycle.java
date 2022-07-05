package udhao;

public class MotorCycle {
	private	double fareMoto;
	private double baseFare = 30;
	private double distanceFare;
	private double timeFare;
	private double totalFare;
	private double promoFare;
	private double OnlineCut = 0;
	private double speed = 70;
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

	public MotorCycle(double dist, String Offer, String online) {
		fareMoto = this.baseFare;
		fareMoto = fareMoto + (dist*15);
		this.distanceFare = (dist *15);
		this.time = dist/speed;
		fareMoto = fareMoto + (120 * time);
		this.timeFare = 120*time;
		this.totalFare = fareMoto;
		Promotion promotion = new Promotion();
		fareMoto = promotion.fareP(Offer, fareMoto);
		this.promoFare = fareMoto;
		if (online.equals("Yes")) {
			OnlineCut = promoFare *.1;
			fareMoto = fareMoto - OnlineCut;
		}
		else {
			OnlineCut = 0;
		}
		
		
	}
 void bill() {
		
		System.out.println("Grand total fare: " + this.fareMoto + "taka");
	}
	
	

}
