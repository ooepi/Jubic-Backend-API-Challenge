package com.roha.jubicbackendAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class LicenseController {
	
	//Bring the local database
	private final LicenseRepository repository;
	
	LicenseController(LicenseRepository repository) {
		this.repository = repository;
	}
	
	
	@GetMapping("/api/license/{id}")
	License GetLicense(@PathVariable Long id) {
		License license = repository.findById(id).orElseThrow(() -> new LicenseNotFoundException(id));
		license.setQueriedAt(LocalDate.now());
		return license;
	}
	
}
