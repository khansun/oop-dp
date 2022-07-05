package pathao101;

public class Promotion {

	private double promoCare;

		double fareP(String offer1, double fareC) {
			double cut = 0;
			if(offer1.equals("Flat")) {
				cut = 50;
				fareC = fareC - cut;
			}
			else if (offer1.equals("Percent")) {
				cut = fareC * .2;
				fareC = fareC - cut;
			}
			else if (offer1.equals("Capped")) {
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

