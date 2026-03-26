package br.computacao.aulapoo;

import java.util.ArrayList;
import java.util.List;

import br.computacao.aulapoo.models.Student;
import br.computacao.aulapoo.models.Course;
import br.computacao.aulapoo.models.Subject;
import br.computacao.aulapoo.models.Address;
import br.computacao.aulapoo.models.Professor;
import br.computacao.aulapoo.models.AcademicDegree;

/**
 * Defines the class App for this project.
 */
public class App {

	public static void main(String[] args) {
		
		Address lucasAddress = new Address(0, "Eucalyptus Avenue", "8", "Downtown");
		
		Professor celso = new Professor();
		Professor camila = new Professor();;
		
		Subject subject = new Subject(0, "Computer Theory", celso);
		Subject embeddedSystems = new Subject(0, "Embedded Systems", camila);
		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(embeddedSystems);
		subjects.add(subject);
		
		
		celso = new Professor(0, "Celso", AcademicDegree.DOCTOR, subjects);
		camila = new Professor(0, "Celso", AcademicDegree.DOCTOR, subjects);
		
		Course computerScienceCourse = new Course(0, "Computer Science", subjects);
		
		Student gustavo = new Student(0, "Gustavo", lucasAddress, computerScienceCourse);
		Student lucas = new Student(1, "Lucas", lucasAddress, computerScienceCourse);
		
		System.out.println(gustavo.getName());
		System.out.println(gustavo.getAddress().getStreet());
		System.out.println(gustavo.getCourse().getName());
		System.out.println(lucas.getName());
		
	}
}
