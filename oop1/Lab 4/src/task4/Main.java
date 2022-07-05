package task4;

public class Main {
	public static void main(String [] args) {
		Animal[] myanimaii = new Animal[4];
	myanimaii[0] = new Dog("Spike");
	myanimaii[1] = new Dog("Wali");
	myanimaii[2] = new Cat("Tasnuva");
	myanimaii[3] = new Duck("Plabon");
	for(int i = 0; i < myanimaii.length; i++) {
		myanimaii[i].move();
		myanimaii[i].sayHello();
	}
	}
}
