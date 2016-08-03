/**
 * 
 */
package com.spk;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author M1025703
 *
 */
public class SPKCustomEventPublisher implements ApplicationEventPublisherAware  {

	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher
	(ApplicationEventPublisher publisher){
		this.publisher = publisher;
	}

	public void publish() {
		SPKCustomEvent ce = new SPKCustomEvent(this);
		publisher.publishEvent(ce);
	}

}
