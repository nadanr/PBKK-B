package com.nada.pbkk1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuangConfig {
	
	@Bean
	public Ruang lab() {
		Lab myLab = new Lab("Lab Komputer", 3, 3, 4, 1);
		return myLab;
	}

}
