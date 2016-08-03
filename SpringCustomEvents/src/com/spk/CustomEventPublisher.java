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
public class CustomEventPublisher 
implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher
	(ApplicationEventPublisher publisher){
		this.publisher = publisher;
	}

	public void publish() {
		SPKCustomEvent sce = new SPKCustomEvent(this);
		publisher.publishEvent(sce);
	}
}