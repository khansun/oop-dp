package task4;

public class Duck extends Aves {
	public Duck(String name){
		super(name);
	}
	void sayHello() {
		super.sayHello();
		System.out.println("Quack!");
	}
}
