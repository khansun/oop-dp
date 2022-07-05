import java.util.*;

public class Threading implements Runnable{
	String name;
	int time;
	
	Random random = new Random();

	public Threading(String name) {
		this.name = name;
		this.time = random.nextInt(5000);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(name + " will sleep for " + time);
			Thread.sleep(time);
			System.out.println(name + " done sleeping");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
}
