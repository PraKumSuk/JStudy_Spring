/**
 * 
 */
package com.spk;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author M1025703
 *
 */
public class InitHelloWorld implements BeanPostProcessor {
	 
	   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	      System.out.println("Before Initialization of Bean inside postProcessBeforeInitialization method: " + beanName);
	      return bean;  // you can return any other object as well
	   }

	   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	      System.out.println("After Initialization of Bean inside postProcessAfterInitialization method : " + beanName);
	      return bean;  // you can return any other object as well
	   }

	}
