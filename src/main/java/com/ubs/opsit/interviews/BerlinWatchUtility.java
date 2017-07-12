package com.ubs.opsit.interviews;

public class BerlinWatchUtility {
	
	private static final BerlinWatchUtility berlinWatchUtil = new BerlinWatchUtility();
	
	private BerlinWatchUtility(){
	}
	
	public static BerlinWatchUtility getBerlinWatchUtility(){
		return berlinWatchUtil;
	}
	
	public int getTotalNumberOfOnLampsforTopRow(int timeUnit){
		return (timeUnit - (timeUnit % 5)) / 5;
	}
	
	public int getTotalNumberOfOnLampsforBottomRow(int timeUnit){
		return timeUnit % 5;
	}

}
