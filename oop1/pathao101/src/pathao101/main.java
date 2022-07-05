package pathao101;
import java.util.Scanner;

public class main {
	
		public static void main(String[] args) {
			System.out.println("pathao101");
			Scanner doubleScanner = new Scanner(System.in);
			Scanner lineScanner = new Scanner(System.in);
			
			System.out.println("Give your promotion: ");
			String Poffer = lineScanner.nextLine();
			System.out.println("Enter the distance to your destination: ");
			double distance = doubleScanner.nextDouble();
			System.out.println("Did you pay online? Yes | No");
			String online = lineScanner.nextLine();
			
			System.out.println("Which vehicle do you want to ride?");
			String vehicle = lineScanner.nextLine();
			

			if (vehicle.equals("Car")) {
				Car Toyota = new Car(distance, Poffer, online);
				System.out.println("Base Fare " +Toyota.getBaseFare() +"taka");
				System.out.println("Distance Fare " + Toyota.getDistanceFare() + "taka");
				System.out.println("Duration Fare " + Toyota.getTimeFare() + "taka");
				System.out.println("Total " + Toyota.getTotalFare() + "taka");
				System.out.println("Promo fare " + Toyota.getPromoFare() + "taka");
				System.out.println("Online payment Discount " + Toyota.getOnlineCut() + "taka");
				System.out.println("Grand total fare: " + Toyota.get_grand_bill() + "taka");
			
		}

			
			else if (vehicle.equals("Motorcycle")) {
				Bike Yamaha = new Bike(distance, Poffer, online);
				System.out.println("Base Fare " +Yamaha.getBaseFare() +"taka");
				System.out.println("Distance Fare " + Yamaha.getDistanceFare() + "taka");
				System.out.println("Duration Fare " + Yamaha.getTimeFare() + "taka");
				System.out.println("Total " + Yamaha.getTotalFare() + "taka");
				System.out.println("Promo fare " + Yamaha.getPromoFare() + "taka");
				System.out.println("Online payment Discount " + Yamaha.getOnlineCut() + "taka");
				System.out.println("Grand total fare: " + Yamaha.get_grand_bill() + "taka");
				
			} 
			else if (vehicle.equals("Bicycle")) {
				bicycle Foxter = new bicycle();
				System.out.println("Base Fare " +Foxter.getBaseFare() +"taka");
				System.out.println("Distance Fare " + Foxter.getDistanceFare() + "taka");
				System.out.println("Duration Fare " + Foxter.getTimeFare() + "taka");
				System.out.println("Total " + Foxter.getTotalFare() + "taka");
				System.out.println("Promo fare " + Foxter.getPromoFare() + "taka");
				System.out.println("Grand total fare: " + Foxter.get_grand_bill() + "taka");
				
			
	}

		}
	}
