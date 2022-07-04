package pi;

public class Perimeter {
	double rad,len;
	Perimeter(double a, double b){
		rad = a;
		len = b;
	}
	 Perimeter(){
		
		rad=len=0;
	}
	void nothing(){
	 System.out.println("Undefined");
	}
	 Perimeter(double r){
		rad=len=2*Math.PI*r;
	}
	 void circle() {
		 System.out.println("Area of the circle is: "+rad);
	 }
	
	 double rectangle() {
		 return 2*(rad+len);
	 }
}