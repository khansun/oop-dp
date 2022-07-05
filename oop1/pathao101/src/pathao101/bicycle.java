package pathao101;

import pathao101.Promotion;

public class bicycle {

	private	double cycleFare;
	private double baseFare = 20;
	private double distanceFare;
	private double timeFare;
	private double totalFare;
	private double promoFare;
	private double OnlineCut = 0;
	private double speed = 20;
	private double time;
	
	public void biycle(double dist, String Offer, String online) {
		cycleFare = this.baseFare;
		cycleFare = cycleFare + (dist*10);
		this.distanceFare = (dist *10);
		this.time = dist/speed;
		cycleFare = cycleFare + (120 * time);
		this.timeFare = 120*time;
		this.totalFare = cycleFare;
		Promotion promotion = new Promotion();
		cycleFare = promotion.fareP(Offer, cycleFare);
		this.promoFare = cycleFare;
		if (online.equals("Yes")) {
			OnlineCut = promoFare *.1;
			cycleFare = cycleFare - OnlineCut;
		}
		else {
			OnlineCut = 0;
		}
		
		
	}

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

	
 double get_grand_bill() {
		
		return cycleFare;
	}
	
	
}



