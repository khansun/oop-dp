
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thead1 = new Thread(new Threading("thread1"));
		Thread thead2 = new Thread(new Threading("thread2"));
		Thread thead3 = new Thread(new Threading("thread3"));
		Thread thead4 = new Thread(new Threading("thread4"));
		
		
		thead1.start();
		thead2.start();
		thead3.start();
		thead4.start();
		
	}

}
