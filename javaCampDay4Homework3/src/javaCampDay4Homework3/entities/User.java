package javaCampDay4Homework3.entities;

import java.time.LocalDate;

import javaCampDay4Homework3.abstracts.Entity;
import javaCampDay4Homework3.concretes.UserManager;

public class User implements Entity{
	private String nationalityId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public User() {
		
	}
	
	public User(String nationalityId, String firstName, String lastName, LocalDate dateOfBirth) {
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
