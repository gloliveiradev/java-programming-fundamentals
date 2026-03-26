package br.computacao.aulapoo.models;

/**
 * Defines the class Student for this project.
 */
public class Student {
	private long Id;
	public Student(long id, String name, Address address, Course course) {
		Id = id;
		Name = name;
		Address = address;
		Course = course;
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
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public Course getCourse() {
		return Course;
	}
	public void setCourse(Course course) {
		Course = course;
	}
	private String Name;
	private Address Address;
	private Course Course;
}
