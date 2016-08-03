/**
 * 
 */
package com.spk;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1025703
 *
 */
public class MainApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansSPK.xml");
		
		System.out.println("App Context call completed 1111111111111");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		context.registerShutdownHook();
	}
}
