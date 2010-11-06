package it.rambow.fhb.junit;

/* import static erlaubt das verwenden von Asserts ohne package Namen
 * org.junit.Assert.assertEquals() => assertEquals() 
 */
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author mark
 *
 */
public class SimpleJunitExampleTest {

	private static SimpleJUnitExample sje;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sje = new SimpleJUnitExample();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSimpleGetLargestNumber() {
		assertEquals("largest element should be 9", 9,sje.getLargestNumber(new int[] {3,5,7,9,2}));
	}
	
	@Test 
	@Ignore
	public void testNegativeGetLargestNumber() {
		assertEquals("largest element should be -2", -2,sje.getLargestNumber(new int[] {-3,-5,-2,-7,-9}));
	}
	
	@Test 
	@Ignore
	public void testOrderGetLargestNumber() {
		assertEquals("DESC ordered", 9, sje.getLargestNumber(new int[] {9,8,7}));
		assertEquals("unordered", 9, sje.getLargestNumber(new int[] {7,9,8}));
		assertEquals("ASC ordered", 9, sje.getLargestNumber(new int[] {7,8,9}));
	}	
}
