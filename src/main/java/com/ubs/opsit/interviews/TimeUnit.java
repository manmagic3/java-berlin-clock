package com.ubs.opsit.interviews;

public interface TimeUnit {
	
	
	public default String switchOnLampsAsPerTime(int numOfLamps,
												 int numOfOnLamps,
												 LampColor color  ){
		
		StringBuilder lampPattern = new StringBuilder();
		
        for (int i = 0; i < numOfOnLamps; i++) {
            lampPattern.append(color.getValue());
        }
        
        for (int i = 0; i < (numOfLamps - numOfOnLamps); i++) {
        	lampPattern.append(LampColor.OFF.getValue());
        }
        return lampPattern.toString();
        
	}
	
	public String getConvertedTime(int timeUnit);

}
