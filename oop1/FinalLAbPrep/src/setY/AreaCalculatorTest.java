package setY;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {
    @Test
    public void aRectangleAndACircle(){
        Rectangle r = new Rectangle(4, 5);
        Circle c = new Circle(2);

        Shape[] shapes = {r, c};

        double actual = AreaCalculator.sumAreas(shapes);

        assertEquals(32.5664, actual, 1e-3);
    }
}
