package setY;

public class AreaCalculator {
 
    public static double sumAreas(Shape[] shapeList) {
        double sum = 0;
        for (Shape shape : shapeList) {
      
                sum += shape.getArea();
       }
        return sum;
}
}
interface Shape {
	 double getArea();
}

class Rectangle implements Shape {
    public final double height;
    public final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
    	return height*width;
    }
}

class Circle implements Shape {

    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
    	return Math.PI*radius*radius;
    }
}

