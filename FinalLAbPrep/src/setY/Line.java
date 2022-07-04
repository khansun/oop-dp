package setY;

public class Line {
	double x1, x2, y1, y2;
	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
    public double getLength() {
    	double distanceX = x1 - x2;
    	double distanceY = y1 - y2;
        double length = Math.sqrt(distanceX*distanceX+ distanceY*distanceY);
        return length;
    }

    public double getSlope() {
    	double delX = (x2 - x1);
        double delY = (y2 - y1);
    	return  delY/delX ;
    }
}
