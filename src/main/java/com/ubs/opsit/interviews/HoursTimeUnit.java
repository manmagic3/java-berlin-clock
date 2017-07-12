package com.ubs.opsit.interviews;


public class HoursTimeUnit implements TimeUnit {
	
	private final int numOfLamps=4;

	@Override
	public String getConvertedTime(int timeUnit) {
		
		String topRowHoursTime = switchOnLampsAsPerTime(numOfLamps,
								BerlinWatchUtility.getBerlinWatchUtility().getTotalNumberOfOnLampsforTopRow(timeUnit),
										LampColor.RED);
		
		String bottomRowHoursTime = switchOnLampsAsPerTime(numOfLamps,
				BerlinWatchUtility.getBerlinWatchUtility().getTotalNumberOfOnLampsforBottomRow(timeUnit),
				LampColor.RED); 
		
		return topRowHoursTime + "\r\n" + bottomRowHoursTime ;
	}

}
