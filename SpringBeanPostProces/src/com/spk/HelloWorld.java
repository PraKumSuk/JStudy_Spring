/**
 * 
 */
package com.spk;

/**
 * @author M1025703
 *
 */
public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }

	   public void init(){
	      System.out.println("Inside init method");
	   }

	   public void destroy(){
	      System.out.println("Inside destroy method");
	   }
	}