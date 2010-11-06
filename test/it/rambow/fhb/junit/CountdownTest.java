package it.rambow.fhb.junit;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountdownTest {

	private GregorianCalendar gc_start, gc_end;
	private Match match;
	private Countdown cd;
	private Environmental env_1959 = new MockEnvironment();
	private Environmental env_2015 = new MockEnvironment();
	private Environmental env_2315 = new MockEnvironment();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.gc_start = new GregorianCalendar(2008,GregorianCalendar.JUNE,1,20,00,00);
		this.gc_end = new GregorianCalendar(2008,GregorianCalendar.JUNE,1,21,50,00);
		this.match = new FootballMatch(gc_start.getTimeInMillis(), gc_end.getTimeInMillis()); 
		
		this.env_2315.setCurrTime(new GregorianCalendar(2008,GregorianCalendar.JUNE,1,23,15,00).getTimeInMillis());
		this.env_2015.setCurrTime(new GregorianCalendar(2008,GregorianCalendar.JUNE,1,20,15,00).getTimeInMillis());
		this.env_1959.setCurrTime(new GregorianCalendar(2008,GregorianCalendar.JUNE,1,19,59,00).getTimeInMillis());
		this.cd = new Countdown();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsMatchtime() {
		this.cd.setEnvironment(this.env_2015);
		assertTrue(this.cd.isMatchtime(this.match));
		this.cd.setEnvironment(this.env_1959);
		assertFalse(this.cd.isMatchtime(this.match));
		this.cd.setEnvironment(this.env_2315);
		assertFalse(this.cd.isMatchtime(this.match));
	}

	@Test
	public void testIsMatchStarted() {
		this.cd.setEnvironment(this.env_2015);
		assertTrue(cd.isMatchStarted(this.match));
		this.cd.setEnvironment(this.env_2315);
		assertTrue(cd.isMatchStarted(this.match));
		this.cd.setEnvironment(this.env_1959);
		assertFalse(cd.isMatchStarted(this.match));
	}

	@Test
	public void testIsMatchNotEnded() {
		this.cd.setEnvironment(env_2015);
		assertTrue(cd.isMatchNotEnded(this.match));
		this.cd.setEnvironment(env_1959);
		assertTrue(cd.isMatchNotEnded(this.match));
		this.cd.setEnvironment(env_2315);
		assertFalse(cd.isMatchNotEnded(this.match));
	}

}
