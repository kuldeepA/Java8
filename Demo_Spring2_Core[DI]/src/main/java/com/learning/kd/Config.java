package com.learning.kd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean("textEditor")
	public TextEditor getTexteditor() {
		
		return new TextEditor();
	}
	@Bean("spellChecker")
	public SpellChecker getSpellChecker() {
		
		return new SpellChecker();
	}
}
