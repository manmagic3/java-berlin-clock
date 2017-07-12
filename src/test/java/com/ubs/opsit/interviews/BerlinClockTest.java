package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
	
	private TimeConverter berlinClock = new BerlinWatchTimeConverter();

	@Test
	public void test() {
		assertEquals("Y\n" +
	            "OOOO\n" +
	            "OOOO\n" +
	            "OOOOOOOOOOO\n" +
	            "OOOO", berlinClock.convertTime("00:00:00"));
	}

}
