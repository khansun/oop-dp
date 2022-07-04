package shape;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Line sg = new Line(1,4,6,8);
	sg.Draw();
	Triangle xps = new Triangle(1,4,2,5,3,4);
	xps.Draw();
	Rectangle abcd = new Rectangle(3, 7, -5, -5, -4, 8 , 7, -6);
	abcd.Draw();
	Circle oops = new Circle();
	oops.setCenter(5, 5);
	oops.setRad(9);
	oops.Draw();
	}

}
