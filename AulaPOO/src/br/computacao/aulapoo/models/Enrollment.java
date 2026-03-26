package br.computacao.aulapoo.models;

/**
 * Defines the class Enrollment for this project.
 */
public class Enrollment {
	private Student Student;

	public Enrollment(Student student, double grade, int attendance, ClassGroup classGroup) {
		Student = student;
		Grade = grade;
		Attendance = attendance;
		ClassGroup = classGroup;
	}
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	public int getAttendance() {
		return Attendance;
	}
	public void setAttendance(int attendance) {
		Attendance = attendance;
	}
	public ClassGroup getClassGroup() {
		return ClassGroup;
	}

	public void setClassGroup(ClassGroup classGroup) {
		ClassGroup = classGroup;
	}
	private double Grade;
	private int Attendance;
	private ClassGroup ClassGroup;
}
