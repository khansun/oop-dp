package comp;

public class Person {
	private Job jox;
	public Person() {
		this.jox = new Job();
		jox.setSalary(75000);
	}
	public long getSalary() {
		return jox.getSalary();
	}
}
