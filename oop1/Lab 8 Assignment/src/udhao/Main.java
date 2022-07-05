package udhao;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Uthao!");
	 Scanner lineScanner = new Scanner(System.in);
		Scanner doubleScanner = new Scanner(System.in);
		System.out.println("Enter your promotion: ");
		String Poffer = lineScanner.nextLine();
		System.out.println("Enter the distance to your destination: ");
		double distance = doubleScanner.nextDouble();
		System.out.println("Did you pay online? Yes | No");
		String online = lineScanner.nextLine();
		
		System.out.println("Which vehicle do you want to ride?");
		String vehicle = lineScanner.nextLine();
		

		if (vehicle.equals("Car")) {
			Car Lux = new Car(distance, Poffer, online);
			System.out.println("Base Fare " +Lux.getBaseFare() +"taka");
			System.out.println("Distance Fare " + Lux.getDistanceFare() + "taka");
			System.out.println("Duration Fare " + Lux.getTimeFare() + "taka");
			System.out.println("Total " + Lux.getTotalFare() + "taka");
			System.out.println("Promo fare " + Lux.getPromoFare() + "taka");
			System.out.println("Online payment Discount " + Lux.getOnlineCut() + "taka");
			Lux.bill();
		
	}

		else if (vehicle.equals("Bicycle")) {
			BiCycle bmx = new BiCycle(distance, Poffer, online);
			System.out.println("Base Fare " +bmx.getBaseFare() +"taka");
			System.out.println("Distance Fare " + bmx.getDistanceFare() + "taka");
			System.out.println("Duration Fare " + bmx.getTimeFare() + "taka");
			System.out.println("Total " + bmx.getTotalFare() + "taka");
			System.out.println("Promo fare " + bmx.getPromoFare() + "taka");
			System.out.println("Online payment Discount " + bmx.getOnlineCut() + "taka");
			bmx.bill();
		
}
		else if (vehicle.equals("Motorcycle")) {
			MotorCycle ducatti = new MotorCycle(distance, Poffer, online);
			System.out.println("Base Fare " +ducatti.getBaseFare() +"taka");
			System.out.println("Distance Fare " + ducatti.getDistanceFare() + "taka");
			System.out.println("Duration Fare " + ducatti.getTimeFare() + "taka");
			System.out.println("Total " + ducatti.getTotalFare() + "taka");
			System.out.println("Promo fare " + ducatti.getPromoFare() + "taka");
			System.out.println("Online payment Discount " + ducatti.getOnlineCut() + "taka");
			ducatti.bill();
			
		} 


}
	}