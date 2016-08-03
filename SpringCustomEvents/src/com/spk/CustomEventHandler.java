/**
 * 
 */
package com.spk;

import org.springframework.context.ApplicationListener;

/**
 * @author M1025703
 *
 */
public class CustomEventHandler 
implements ApplicationListener<SPKCustomEvent>{

	public void onApplicationEvent(SPKCustomEvent event) {
		System.out.println(event.toString());
	}

}