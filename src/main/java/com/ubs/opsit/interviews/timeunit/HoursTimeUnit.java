package com.ubs.opsit.interviews.timeunit;

import com.ubs.opsit.interviews.model.LampColor;
import com.ubs.opsit.interviews.util.BerlinWatchUtility;


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
		
		return new StringBuilder().append(topRowHoursTime) 
								  .append(DELIMITER)
								  .append(bottomRowHoursTime)
								  .append(DELIMITER)
								  .toString();
	}

}
