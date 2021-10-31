package com.roha.jubicbackendAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LicenseController {
	
	private final LicenseRepository repository;
	
	LicenseController(LicenseRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/api/license/{id}")
	License one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new LicenseNotFoundException(id));
		
	}
	
	@GetMapping("/api/license/")
	List<License> all(){
		return repository.findAll();
		
	}
	
}
