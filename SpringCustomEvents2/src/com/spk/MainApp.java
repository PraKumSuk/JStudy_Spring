package com.spk;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");

		SPKCustomEventPublisher cvp = (SPKCustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();  
		cvp.publish();
		cvp.publish();
		cvp.publish();
	}

}
