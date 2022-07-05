package shapeup;

public class Main {
	public static void main(String args[]) {
		Shape shape = new Shape();
		Rectangle rect = new Rectangle(10.0,5.0);
		shape = rect;
		rect.area();
	}
}
