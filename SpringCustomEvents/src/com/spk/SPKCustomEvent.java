/**
 * 
 */
package com.spk;

import org.springframework.context.ApplicationEvent;

/**
 * @author M1025703
 *
 */
public class SPKCustomEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SPKCustomEvent(Object source) {
		super(source);
	}

	public String toString(){
		return "My Custom Event Bro";
	}
}
