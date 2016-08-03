/**
 * 
 */
package com.spk.second.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author M1025703
 *
 */
@Configuration
public class TextEditorConfig {

   @Bean   
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}
