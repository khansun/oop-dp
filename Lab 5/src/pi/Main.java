package pi;

public class Main {
	public static void main(String[] args) {
		Perimeter myvoid = new Perimeter();
		Perimeter mycircle = new Perimeter(5);
		Perimeter myrectangle = new Perimeter(17,13);
	double area;
	myvoid.nothing();
	mycircle.circle();
	
	area = myrectangle.rectangle();
	System.out.println("Area of the rectangle is: "+area);
	}
}
