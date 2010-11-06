package it.rambow.fhb.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEqualsUserCaseSensitive() {
		User org = new User("Name" , "Street", "City");
		User u_1 = new User("Name" , "Street", "City");
		User u_2 = new User("name" , "street", "city");		

		assertTrue(org.equals(u_1));
		assertFalse(org.equals(u_2));
		
	}

}
