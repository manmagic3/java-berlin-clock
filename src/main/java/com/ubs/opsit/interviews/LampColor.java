package com.ubs.opsit.interviews;

public enum LampColor {
	
	YELLOW("Y"),
	RED("R"),
	OFF("O");
	
	private String value;
	
    private LampColor(String value) {
	      this.value = value;
	   }
	   
	 public String getValue() {
	      return value;
	   }
	

}
