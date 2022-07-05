package strategy;

public class Owl extends Animal{
	
	

    public Owl(){

        super();

        setSound("Hoot");
         

        // We set the Flys interface polymorphically

        // This sets the behavior as a non-flying Animal

        flyingType = new ItFlys();

           }


}
