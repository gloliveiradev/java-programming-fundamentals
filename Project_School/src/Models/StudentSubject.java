package Models;

/**
 * Defines the class StudentSubject for this project.
 */
public class StudentSubject {
	private Student Student;
	public StudentSubject(Models.Student student, Models.Subject subject, float grade) {
		Student = student;
		Subject = subject;
		Grade = grade;
	}
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	public Subject getSubject() {
		return Subject;
	}
	public void setSubject(Subject subject) {
		Subject = subject;
	}
	public float getGrade() {
		return Grade;
	}
	public void setGrade(float grade) {
		Grade = grade;
	}
	private Subject Subject;
	private float Grade; 
}
