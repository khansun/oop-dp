package shape;

public class Line extends DrawShape {
	int x1, x2, y1, y2;
	public Line(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
		this.x1 = a;
		this.y1 = b;
		this.x2 = c;
		this.y2 = d;
	}
	void Draw() {
		System.out.println("Drawing the shape of a Line using Start points "+ x1 + "," + y1 +" and End points: "  + x2 + ","+ y2);

	}

}
