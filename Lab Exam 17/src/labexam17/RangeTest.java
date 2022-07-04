package labexam17;


	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	public class RangeTest {

	    @Test
	    public void twobetweenfourand0() {
	    	Range range1 = new Range(0,4);
	    			
	    			assertEquals(true, range1.contains(2));
	    }

	    @Test
	    public void twoAndTwoAreTwentyTwo() {
	    	Range range1 = new Range(2,22);
			
			assertEquals(true, range1.contains(2));
	
	    }
	    @Test
	    public void in() {
	    	Range range1 = new Range(2,9);
	    	Range range2 = new Range(3, 7);
	    	assertEquals(true, range1.containsRange(range2));
	    }
	    
	    @Test
	    public void notIn() {
	    	Range range1 = new Range(20,30);
	    	Range range2 = new Range(10, 20);
	    	assertEquals(false, range1.containsRange(range2));
	    }
	    
	}
