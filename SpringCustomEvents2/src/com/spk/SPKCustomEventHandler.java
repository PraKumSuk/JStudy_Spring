package com.spk;

import org.springframework.context.ApplicationListener;

public class SPKCustomEventHandler implements ApplicationListener<SPKCustomEvent> {
	
	public void onApplicationEvent(SPKCustomEvent event) {
	      System.out.println(event.toString());
	   }

}
