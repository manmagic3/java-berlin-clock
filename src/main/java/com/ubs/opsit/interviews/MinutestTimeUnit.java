package com.ubs.opsit.interviews;

public class MinutestTimeUnit implements TimeUnit {
	
	private final int numberOfLampsInTopRow = 11;
	private final int numberOfLampsinBottomRow = 4;

	@Override
	public String getConvertedTime(int timeUnit) {
		
		String topRowHoursTime = switchOnLampsAsPerTime(numberOfLampsInTopRow,
				BerlinWatchUtility.getBerlinWatchUtility().getTotalNumberOfOnLampsforTopRow(timeUnit),
						LampColor.YELLOW).replaceAll("YYY", "YYR");

		String bottomRowHoursTime = switchOnLampsAsPerTime(numberOfLampsinBottomRow,
				BerlinWatchUtility.getBerlinWatchUtility().getTotalNumberOfOnLampsforBottomRow(timeUnit),
						LampColor.YELLOW); 

		return topRowHoursTime + "\r\n" + bottomRowHoursTime ;
		
		
	}

}
