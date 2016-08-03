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
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansSPK.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage("Object A set with some value");
		objA.getMessage();
		System.out.println("Reference of Object A is : "+objA);

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		
		objB.setMessage("Object B set with some value");
		objB.getMessage();
		System.out.println("Reference of Object B is : "+objB);
	}
}