/**
 * 
 */
package com.spk;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author M1025703
 *
 */
public class CStopEventHandler 
implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStoppedEvent Received");
	}
}
