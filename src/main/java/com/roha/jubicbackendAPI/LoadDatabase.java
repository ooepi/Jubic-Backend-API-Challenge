package com.roha.jubicbackendAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {
	
	@Bean
	CommandLineRunner initDatabase(LicenseRepository repository) {
		
		return args -> {
			repository.save(new License("License1", LocalDate.of(2022, 1, 1)));
			repository.save(new License("license2", LocalDate.of(2023, 2, 5)));
			repository.save(new License("License3", LocalDate.of(2025, 6, 9)));
			repository.save(new License("testLicense", LocalDate.of(2023, 1, 4)));
		};
				
	}
	
}
