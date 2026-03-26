package Models;

import java.util.List;

/**
 * Defines the class Course for this project.
 */
public class Course {
	private int Id;
	public Course(int id, String name, List<Subject> subjects, Coordinator coordinator) {
		Id = id;
		Name = name;
		Subjects = subjects;
		Coordinator = coordinator;
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
	public Coordinator getCoordinator() {
		return Coordinator;
	}
	public void setCoordinator(Coordinator coordinator) {
		Coordinator = coordinator;
	}
	private String Name;
	private List<Subject> Subjects;
	private Coordinator Coordinator; 
}
