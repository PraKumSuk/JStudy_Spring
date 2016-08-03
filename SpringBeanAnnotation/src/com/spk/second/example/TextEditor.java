/**
 * 
 */
package com.spk.second.example;

/**
 * @author M1025703
 *
 */
public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor." );
		this.spellChecker = spellChecker;
	}
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
