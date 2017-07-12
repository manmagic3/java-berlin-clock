package com.ubs.opsit.interviews.timeunit;

import com.ubs.opsit.interviews.model.LampColor;
import com.ubs.opsit.interviews.util.BerlinWatchUtility;

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

		return new StringBuilder().append(topRowHoursTime)
								  .append(DELIMITER)
								  .append(bottomRowHoursTime).toString() ;
		
		
	}

}
