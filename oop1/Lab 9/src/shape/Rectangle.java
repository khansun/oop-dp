package shape;

public class Rectangle extends DrawShape{
	Line[] Side = new Line[4];
	public Rectangle(int a, int b, int c , int d, int e, int f, int g, int h) {
	this.Side[0] = new Line(a, b, e , f );
	this.Side[1] = new Line(e, f, c, d);
	this.Side[2] = new Line(c, d, g, h);
	this.Side[3] = new Line(g, h, a, b);
	
	}
	
	void Draw() {
		System.out.println("Drawing the shape of Rectangle using 4 lines: ");
		for(int i=0; i<4; i++) {
			Side[i].Draw();
		}
	
	}

}
