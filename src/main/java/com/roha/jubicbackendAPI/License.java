package com.roha.jubicbackendAPI;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class License {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private LocalDate expiresAt;
	private LocalDate queriedAt;
	
	public License() {}
	
	public License(String name, LocalDate expiresAt) {
		this.name = name;
		this.expiresAt = expiresAt;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(LocalDate expiresAt) {
		this.expiresAt = expiresAt;
	}

	public LocalDate getQueriedAt() {
		return queriedAt;
	}

	public void setQueriedAt(LocalDate queriedAt) {
		this.queriedAt = queriedAt;
	}



	@Override
	public String toString() {
		return "License [id=" + id + ", name=" + name + ", expiresAt=" + expiresAt + ", queriedAt=" + queriedAt + "]";
	}
	
	
	
}
