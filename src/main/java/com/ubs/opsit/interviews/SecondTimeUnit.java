package com.ubs.opsit.interviews;

public class SecondTimeUnit implements TimeUnit {

	@Override
	public String getConvertedTime(int timeUnit) {
		
		if(timeUnit%2==0) {
			return LampColor.YELLOW.getValue();
		}
		return LampColor.OFF.getValue();
	}

}
