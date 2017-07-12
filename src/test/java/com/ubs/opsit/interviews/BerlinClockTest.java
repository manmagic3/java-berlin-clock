package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	
	private TimeConverter berlinClock = new BerlinWatchTimeConverter();

	@Test
	public void testforMidNight() {
		assertEquals("Y\r\n" +
	            "OOOO\r\n" +
	            "OOOO\r\n" +
	            "OOOOOOOOOOO\r\n" +
	            "OOOO", berlinClock.convertTime("00:00:00"));
	}
	
	@Test
	public void testforSomeTimeInNoon() {
		assertEquals("O\r\n"+
					"RROO\r\n"+
					"RRRO\r\n"+
					"YYROOOOOOOO\r\n"+
					"YYOO", berlinClock.convertTime("13:17:01"));
	}
	
	@Test
	public void testforTimeBeforeMidNight() {
		assertEquals("O\r\n"+
					"RRRR\r\n"+
					"RRRO\r\n"+
					"YYRYYRYYRYY\r\n"+
					"YYYY", berlinClock.convertTime("23:59:59"));
	}
	
	@Test
	public void testforTimeAtMidNight() {
		assertEquals("Y\r\n"+
					"RRRR\r\n"+
					"RRRR\r\n"+
					"OOOOOOOOOOO\r\n"+
					"OOOO", berlinClock.convertTime("24:00:00"));
	}

}
