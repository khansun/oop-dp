package task4;

public abstract class Animal {
    String name;
    public Animal(String name) {
    	this.name = name;
    }
    abstract void move();
    void sayHello() {
    	System.out.println(name+ " is saying hello: ");
    }
}
