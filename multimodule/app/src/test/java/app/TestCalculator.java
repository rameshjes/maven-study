package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	Calculator calc = new Calculator();

	@Test
	public void testadd() {
		assertEquals(3, calc.add(1, 2));
	}

	@Test
	public void testsub() {
		assertEquals(5, calc.sub(10, 5));
	}

}
