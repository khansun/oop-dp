package second;

public class Main {
	public static void main(String[] args) {
		Person student = new Student();
		Person customer = new Customer();
		Person me = new Son();
		student.behaviour();
		customer.behaviour();
		me.behaviour();
	}
}
