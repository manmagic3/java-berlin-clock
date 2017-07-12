package com.ubs.opsit.interviews.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinWatchUtilityTest {
	
	private BerlinWatchUtility berlinWatchUtility = BerlinWatchUtility.getBerlinWatchUtility();

	@Test
	public void testGetTotalNumberOfOnLampsForTopRow() {
		assertEquals(3, berlinWatchUtility.getTotalNumberOfOnLampsforTopRow(16));
	}
	
	@Test
	public void testGetTotalNumberOfOnLampsForBottonRow() {
		assertEquals(1, berlinWatchUtility.getTotalNumberOfOnLampsforBottomRow(16));
	}
	
	

}
