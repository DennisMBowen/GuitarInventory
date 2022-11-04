package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Guitar;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 31, 2022
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Guitar guitar() {
		Guitar bean = new Guitar ();
		return bean;
	}

}
