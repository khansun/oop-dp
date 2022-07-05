package fizzbuzz2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	public void case3_should_return_fizz() {
		String expected = "Fizz";
		String actual = new FizzBuzz().getFizzyBuzz(9);
		assertEquals(expected, actual);
	}
	@Test
	public void case5_should_return_buzz() {
		String expected = "Buzz";
		String actual = new FizzBuzz().getFizzyBuzz(25);
		assertEquals(expected, actual);
	}
	@Test
	public void case_3and_5_should_return_fizzbuzz() {
		String expected = "Fizzbuzz";
		String actual = new FizzBuzz().getFizzyBuzz(15);
		assertEquals(expected, actual);
	}
	@Test
	public void case_none_should_return_boom() {
		String expected = "Boom";
		String actual = new FizzBuzz().getFizzyBuzz(17);
		assertEquals(expected, actual);
	}
}
