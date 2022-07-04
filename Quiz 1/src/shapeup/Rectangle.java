package shapeup;

public class Rectangle extends Shape {
	Rectangle(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	double area() {
		return dim1*dim2;
	}
}
