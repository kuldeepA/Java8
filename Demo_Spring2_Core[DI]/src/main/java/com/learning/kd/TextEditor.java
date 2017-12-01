package com.learning.kd;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	@Autowired
	private SpellChecker spellChecker;

	public TextEditor() {
		System.out.println("Inside TextEditor constructor.");
		//spellChecker.checkSpelling();
	}
	//below constructure will be used only for xml const injection
	/*public TextEditor(SpellChecker spellChecker) {
		System.out.println("Injection---Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}*/

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
