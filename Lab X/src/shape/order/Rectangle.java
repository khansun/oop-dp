package shape.order;

public class Rectangle extends Shape{
	int width;
	int height;
	void draw() {
		System.out.println("X:"+ screenX+ " Y:"+ screenY+ " W:"+ width+ " H:" + height );
	}
}
