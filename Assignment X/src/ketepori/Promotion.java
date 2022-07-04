package ketepori;


public class Promotion {		
	private double promoCare;
	
	double fareCare(String offer, double fareC) {
		double off = 0;
		if(offer.equals("Flat")) {
			off = 50;
			fareC = fareC - off;
		}
		else if (offer.equals("Percentage")) {
			off = fareC * .2;
			fareC = fareC - off;
		}
		else if (offer.equals("Capped")) {
			off = fareC *.25;
			if(off>60) {
				fareC = fareC - 60;
			}
			else {
				fareC = fareC -off;
			}
		
	}
		this.promoCare  = off;
	return fareC;
	}
	public double getPromoCare() {
		return promoCare;
	}
}
