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
	public void initSPK(){
		System.out.println("Bean is going through init i.e Before Bean instantiation.");
	}
	public void destroySPK(){
		System.out.println("Bean will be destroyed shortly i.e.");
	}
}