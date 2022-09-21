package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Addtest {
	
	private TheJourneyBegin tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegin();
	}
	
	@Test
	public void test1() {
		assertEquals(3, tjb.add(1, 2)); // Valor esperado, valor devuelto
	}
	
	@Test
	public void test2() {
		assertEquals(1000, tjb.add(0, 1000)); // Valor esperado, valor devuelto
	}
	
	@Test
	public void test3() {
		assertEquals(-37, tjb.add(2, -39)); // Valor esperado, valor devuelto
	}
	
	@Test
	public void test4() {
		assertEquals(199, tjb.add(99, 100)); // Valor esperado, valor devuelto
	}
}
