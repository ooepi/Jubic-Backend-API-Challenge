package com.roha.jubicbackendAPI;

public class LicenseNotFoundException extends RuntimeException{
	public LicenseNotFoundException(Long id) {
		super("License " + id + " not found");
	}
}
