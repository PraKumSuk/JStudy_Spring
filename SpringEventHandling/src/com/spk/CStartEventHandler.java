/**
 * 
 */
package com.spk;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author M1025703
 *
 */
public class CStartEventHandler 
implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}
}