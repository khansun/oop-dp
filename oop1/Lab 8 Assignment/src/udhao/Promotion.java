package udhao;


public class Promotion {		
	private double promoCare;
	
	double fareP(String offer, double fareC) {
		double cut = 0;
		if(offer.equals("Flat")) {
			cut = 50;
			fareC = fareC - cut;
		}
		else if (offer.equals("Percent")) {
			cut = fareC * .2;
			fareC = fareC - cut;
		}
		else if (offer.equals("Capped")) {
			cut = fareC *.25;
			if(cut>60) {
				fareC = fareC - 60;
			}
			else {
				fareC = fareC -cut;
			}
		
	}
		this.promoCare  = cut;
	return fareC;
	}
	public double getPromoCare() {
		return promoCare;
	}
}
