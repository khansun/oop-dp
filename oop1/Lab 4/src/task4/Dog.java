package task4;

public class Dog extends Mammal {
	public Dog(String name) {
		super(name);
	}
	void sayHello() {
		super.sayHello();
		System.out.println("Bark!");
	}
}
