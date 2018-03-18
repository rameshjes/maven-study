package firstmavenproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	Calculator cal = new Calculator();

	@Test
	public void testadd() {
		assertEquals(5, cal.add(4, 1));
	}

	@Test
	public void testsub() {
		assertEquals(0, cal.sub(5, 5));
	}

}
