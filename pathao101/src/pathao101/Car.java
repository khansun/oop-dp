package pathao101;

import pathao101.Promotion;

public class Car {
private double carfare;
private double baseFare = 50;
private double distanceFare;
private double timeFare;
private double totalFare;
private double promoFare;
private double OnlineCut = 0;
private double speed = 60;
private double time;

public Car(double distance, String Offer, String online) {
	carfare = this.baseFare;
	carfare = carfare + (distance*25);
	this.distanceFare = (distance *25);
	this.time = distance/speed;
	carfare = carfare + (120 * time);
	this.timeFare = 120*time;
	this.totalFare = carfare;
	Promotion promotion = new Promotion();
	carfare = promotion.fareP(Offer, carfare);
	this.promoFare = carfare;
	if (online.equals("Yes")) {
		OnlineCut = promoFare *.1;
		carfare = carfare - OnlineCut;
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
	
	return carfare;
}


}
