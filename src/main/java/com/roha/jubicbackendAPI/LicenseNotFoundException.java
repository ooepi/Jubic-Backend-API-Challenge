package com.roha.jubicbackendAPI;

public class LicenseNotFoundException extends RuntimeException{
	LicenseNotFoundException(Long id) {
		super("License " + id + " not found");
	}
}
