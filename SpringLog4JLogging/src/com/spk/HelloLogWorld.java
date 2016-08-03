package com.spk;

public class HelloLogWorld {
	
	private String message;
	
	public void setMessage(String message){
		this.message  = message;
		return;
	}

	public void getMessage(){
		System.out.println("Your Message : " + message);
		return;
	}
}