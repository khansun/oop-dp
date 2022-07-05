package task4;

public  class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
	}
	void move() {
		System.out.println(name+" walks.");
	}
}
