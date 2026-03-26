package Models;

import java.util.List;

/**
 * Defines the class Subject for this project.
 */
public class Subject {
	private int Id;
	public Subject(int id, String name, List<Student> students, Models.Course course) {
		Id = id;
		Name = name;
		Students = students;
		Course = course;
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
	public List<Student> getStudents() {
		return Students;
	}
	public void setStudents(List<Student> students) {
		Students = students;
	}
	public Course getCourse() {
		return Course;
	}
	public void setCourse(Course course) {
		Course = course;
	}
	private String Name;
	private List<Student> Students;
	private Course Course;
}
