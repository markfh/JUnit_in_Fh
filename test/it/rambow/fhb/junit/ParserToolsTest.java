package it.rambow.fhb.junit;

import static org.junit.Assert.*;

import org.junit.*;

public class ParserToolsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testStandardEmail() {
		assertTrue(ParserTools.isEmail("test@dawanda.com"));
	}

	@Test
	public final void testEmailIsNot_A_URL() {
		assertFalse(ParserTools.isEmail("www.dawanda.com"));
	}

	@Test
	public final void testEmailWorksWith4LetterDomain() {
		assertFalse(ParserTools.isEmail("bla@dawanda.info"));
	}

	@Test
	public final void testEmailWithNumbers() {
		assertTrue(ParserTools.isEmail("test123@dawanda.com"));
	}

	@Test
	public final void testEmailWithDomainNumbers() {
		assertTrue(ParserTools.isEmail("test@dawanda123.com"));
	}

	@Test
	public final void testEmailWithoutDomain() {
//		assertFalse(ParserTools.isEmail("test@dawanda"));
	}

	@Test
	public final void testEmailTooShort() {
//		assertTrue(ParserTools.isEmail("t@dawanda.com"));
	}
	
	@Test
	public final void testEmailWith4LengthDomain() {
//		assertTrue(ParserTools.isEmail("t@dawanda.info"));
	}

	
	
	
	
	
	
	
	
	
	
	

	@Test
 	public final void testHyphenEmail() {
//		assertTrue(ParserTools.isEmail("test@fh-brandenburg.de"));
	}
}
