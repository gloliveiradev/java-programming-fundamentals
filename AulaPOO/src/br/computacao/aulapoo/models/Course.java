package br.computacao.aulapoo.models;
import java.util.List;

/**
 * Defines the class Course for this project.
 */
public class Course {
	private int Id;
	private String Name;
	public Course(int id, String name, List<Subject> subjects) {
		Id = id;
		Name = name;
		Subjects = subjects;
	}
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
	public List<Subject> getSubjects() {
		return Subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		Subjects = subjects;
	}
	private List<Subject> Subjects;
}
