package shape;


public class Triangle extends DrawShape {
	Line[] side = new Line[3];
	public Triangle(int x1, int x2, int y1, int y2, int z1, int z2) {
		this. side[0] = new Line(x1, y1, x2, y2);
		this.side[1] = new Line(x2, y2, z1, z2);
		this. side[2] = new Line(z1, z2, x1, y1);
	}
	
	void Draw() {
		System.out.println("Drawing Triangle using the following lines: ");
		side[0].Draw();
		side[1].Draw();
		side[2].Draw();
	}
}
