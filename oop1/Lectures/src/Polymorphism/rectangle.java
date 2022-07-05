package Polymorphism;

class rectangle extends shape{
	rectangle(double length, double width){
		dimension1 = length;
		dimension2 = width;
			
	}
	void area() {
		System.out.println("Area is"+(dimension1*dimension2));
	}
}