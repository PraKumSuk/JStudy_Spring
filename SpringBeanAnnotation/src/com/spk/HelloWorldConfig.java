/**
 * 
 */
package com.spk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author M1025703
 *
 */
@Configuration
public class HelloWorldConfig {

   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
