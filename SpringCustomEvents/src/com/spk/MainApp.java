/**
 * 
 */
package com.spk;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1025703
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");

		CustomEventPublisher cvp = 
				(CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();  
		cvp.publish();
	}
}