package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleProgram {

	SimpleProgram str = new SimpleProgram();
	
	@Test
	public void testprint_name() {
		String result = str.print_name("onetwo");
		assertEquals("onetwo", result);
	}

}
