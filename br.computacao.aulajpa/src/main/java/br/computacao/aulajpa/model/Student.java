package br.computacao.aulajpa.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
/**
 * Defines the class Student for this project.
 */
public class Student {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Name;
	private String Email;
	private String Address;
	@Enumerated(EnumType.STRING)
	private Status studentStatus;
	
	public Student(long id, String name, String email, String address, Status student) {
		Id = id;
		Name = name;
		Email = email;
		Address = address;
		studentStatus = student;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Status getStatus() {
		return studentStatus;
	}
	public void setStatus(Status status) {
		studentStatus = status;
	}
	
	
	
}
