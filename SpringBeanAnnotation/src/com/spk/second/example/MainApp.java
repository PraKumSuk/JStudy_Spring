/**
 * 
 */
package com.spk.second.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author M1025703
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx =new AnnotationConfigApplicationContext(TextEditorConfig.class);

		TextEditor te = ctx.getBean(TextEditor.class);

		te.spellCheck();
	}
}
