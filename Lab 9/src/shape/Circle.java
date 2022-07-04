package shape;

public class Circle extends DrawShape{
	
	private int Cx,Cy;
	private int rad;
	void setCenter(int x , int y){
		this. Cx = x;
		this.Cy = y;
	}
	void setRad(int r) {
		this.rad = r;
	}
	public int getCx() {
		return Cx;
	}
	public int getCy() {
		return Cy;
	}
	public int getRad() {
		return rad;
	}
	void Draw() {
		System.out.println("Drawing the shape of a Circle using Center Points " + Cx + ","+ Cy+ " and Radius: "  + rad);
	}
}
