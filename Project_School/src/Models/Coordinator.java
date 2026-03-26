package Models;

/**
 * Defines the class Coordinator for this project.
 */
public class Coordinator {
	private int Id;
	private String Name;
	public Coordinator(int id, String name, Models.Course course) {
		Id = id;
		Name = name;
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
	public Course getCourse() {
		return Course;
	}
	public void setCourse(Course course) {
		Course = course;
	}
	private Course Course;
	
}
