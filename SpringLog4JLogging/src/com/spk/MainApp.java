/**
 * 
 */
package com.spk;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author M1025703
 *
 */
public class MainApp {
	
	   static Logger logger = Logger.getLogger(MainApp.class.getName());

	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      logger.info("Hey Buddy, Going to create HelloWord Obj nowwww");

	      HelloLogWorld obj = (HelloLogWorld) context.getBean("helloLogWorld");

	      obj.getMessage();

	      logger.info("This is info");
	      
	      logger.error("This is error");
	      
	      logger.debug("This is debug");
	   }
}
