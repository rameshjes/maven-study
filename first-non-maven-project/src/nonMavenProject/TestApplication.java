package nonMavenProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApplication {

	Application app = new Application();
	
	@Test
	public void testAdd() {
		assertEquals(5, app.add(2, 3));
	}
	
	@Test
	public void testsub(){
		assertEquals(-5, app.sub(5, 10));
	}
	
	@Test
	public void testmul(){
		assertEquals(15, app.mul(3, 5));
	}

}
