package setY;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BAET  alage = new BAET ('*');
		BAET l1 = new BAET(4);
		BAET l2 = new BAET(3);
		alage.addNode(l1);
		alage.addNode(l2);
		System.out.println(alage.getValue(alage));
	
	}

}
