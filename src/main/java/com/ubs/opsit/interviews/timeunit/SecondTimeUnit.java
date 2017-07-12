package com.ubs.opsit.interviews.timeunit;

import com.ubs.opsit.interviews.model.LampColor;

public class SecondTimeUnit implements TimeUnit {

	@Override
	public String getConvertedTime(int timeUnit) {
		
		StringBuilder timeBuilder = new StringBuilder();
		
		if(timeUnit%2==0) {
			return timeBuilder.append(LampColor.YELLOW.getValue())
							  .append(DELIMITER)
							  .toString();
		}
		
		return timeBuilder.append(LampColor.OFF.getValue())
				  .append(DELIMITER)
				  .toString();
	}

}
