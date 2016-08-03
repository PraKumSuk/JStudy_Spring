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
		System.out.println("1111111");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println("222222222");
		obj.getMessage();
		context.registerShutdownHook();
	}
}