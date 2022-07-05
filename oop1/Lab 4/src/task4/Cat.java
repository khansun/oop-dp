package task4;

public class Cat extends Mammal {
	public Cat(String name) {
		super(name);
	}
	void sayHello() {
	super.sayHello();
	System.out.println("Nyan!");	
}
}