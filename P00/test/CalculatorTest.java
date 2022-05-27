import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	int a, b;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
	}

	// Test for Addition method
	@Test
	public void testAdd() {
		// fail("Not yet implemented");

		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	// Test for subtraction method
	@Test
	public void testSubtract() {

		int actual = cal.subtract(a, b);

		int expected = 3087;
		assertEquals(actual, expected);
	}

	// Test for multiplication method
	@Test
	public void testMultiple() {

		int actual = cal.multiple(a, b);

		int expected = 5332114;
		assertEquals(actual, expected);
	}

	// Test for division method
	@Test
	public void testDivide() {

		int actual = cal.divide(a, b);

		int expected = 3;
		assertEquals(actual, expected);
	}
	
	// Test if denominator is 0
	public void testDivideWith0Denominator() {
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a, b);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		} catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
		
	}

	@After
	public void tearDown() throws Exception {
	}



}
