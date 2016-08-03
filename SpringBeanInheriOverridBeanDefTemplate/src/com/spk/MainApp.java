/**
 * 
 */
package com.spk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1025703
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");

		/*
		 * Example One - Make appropriate changes in MyBeans.xml
		 HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.getMessage1();
		objA.getMessage2();
		*/
		

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}
}
