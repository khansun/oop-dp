package strategy;

public class HouseAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal brutus = new Dog();
		Animal hedwig = new Owl();
		Animal pixie = new Cat();
		
		System.out.println("Brutus: " + brutus.getSound()+"! " +brutus.tryToFly());
		
		System.out.println("Hedwig: " + hedwig.getSound()+"! " +hedwig.tryToFly());
		
		System.out.println("Pixie: " + pixie.getSound()+"! " + pixie.tryToFly());
		
		// This allows dynamic changes for flyingType
		
		pixie.setFlyingAbility(new ItFlys());
		
		System.out.println("Pixie: " +  pixie.getSound()+"! I can now " +pixie.tryToFly());
	}

}
