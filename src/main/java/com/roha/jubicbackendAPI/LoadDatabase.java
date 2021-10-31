package com.roha.jubicbackendAPI;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(LicenseRepository repository) {
		
		return args -> {
			log.info("Insert to DB " + repository.save(new License("License1", LocalDate.of(2022, 01, 01))));
			log.info("Insert to DB " + repository.save(new License("license2", LocalDate.of(2023, 2, 2))));
		};
				
	}
	
}
