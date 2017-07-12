package com.ubs.opsit.interviews;

import java.util.Arrays;



public class BerlinWatchTimeConverter implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		
		//1. Parse string time into an int array.
		
		int[] timeArray = Arrays.asList(aTime.split(":")).stream().mapToInt(Integer::parseInt).toArray();
		
		
		//2. Create Stringbuilder for berlin watch time
		
		StringBuilder berlinWatchTime = new StringBuilder();
		
		berlinWatchTime.append(new SecondTimeUnit().getConvertedTime(timeArray[2])).append("\r\n")
						.append(new HoursTimeUnit().getConvertedTime(timeArray[0])).append("\r\n")
						.append(new MinutestTimeUnit().getConvertedTime(timeArray[1]));
		
		
		return berlinWatchTime.toString();
	}

}
