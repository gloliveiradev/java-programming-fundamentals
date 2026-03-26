package br.computacao.aulapoo.models;

import java.util.List;

/**
 * Defines the class ClassGroup for this project.
 */
public class ClassGroup {
	private int Id;
	public ClassGroup(int id, String academicTerm, String name, Subject subject,
			List<Enrollment> enrolledStudents) {
		Id = id;
		AcademicTerm = academicTerm;
		Name = name;
		Subject = subject;
		EnrolledStudents = enrolledStudents;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAcademicTerm() {
		return AcademicTerm;
	}
	public void setAcademicTerm(String academicTerm) {
		AcademicTerm = academicTerm;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Subject getSubject() {
		return Subject;
	}
	public void setSubject(Subject subject) {
		Subject = subject;
	}
	public List<Enrollment> getEnrolledStudents() {
		return EnrolledStudents;
	}
	public void setEnrolledStudents(List<Enrollment> enrolledStudents) {
		EnrolledStudents = enrolledStudents;
	}
	private String AcademicTerm;
	private String Name;
	private Subject Subject;
	private List<Enrollment> EnrolledStudents;
}
