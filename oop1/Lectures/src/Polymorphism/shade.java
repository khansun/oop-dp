package Polymorphism;
//through override
class main {
main(){
	rectangle r = new rectangle(10.5,5.5);
	r.area();
}
}
class triangle extends shape{
	triangle(double height,double base){
		dimension1 = height;
		dimension2 = base;
	}
	void area() {
		System.out.println("Area is"+(dimension1*dimension2)/2);
	}
}s