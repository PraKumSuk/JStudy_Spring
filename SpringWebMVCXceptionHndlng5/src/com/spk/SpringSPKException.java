package com.spk;

public class SpringSPKException extends RuntimeException {
	
	private String exceptionMsg;
	   
	   public SpringSPKException(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
	   
	   public String getExceptionMsg(){
	      return this.exceptionMsg;
	   }
	   
	   public void setExceptionMsg(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }

}
