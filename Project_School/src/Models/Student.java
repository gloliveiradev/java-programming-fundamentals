package Models;

import java.util.List;

/**
 * Defines the class Student for this project.
 */
public class Student {
	private int Id;
	public Student(int id, String name, int enrollment, List<Subject> subjects) {
		Id = id;
		Name = name;
		Enrollment = enrollment;
		Subjects = subjects;
	}
	private String Name; 
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEnrollment() {
		return Enrollment;
	}
	public void setEnrollment(int enrollment) {
		Enrollment = enrollment;
	}
	public List<Subject> getSubjects() {
		return Subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		Subjects = subjects;
	}
	private int Enrollment;
	private List<Subject> Subjects;
}
