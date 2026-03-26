package br.computacao.aulapoo.models;

import java.util.List;

/**
 * Defines the class Professor for this project.
 */
public class Professor {
	public Professor(long id, String name, AcademicDegree academicDegree, List<Subject> subjects) {
		
		this.id = id;
		this.name = name;
		this.academicDegree = academicDegree;
		this.subjects = subjects;
	}
	
	public Professor() {
		super();
	}

	private long id;
	private String name;
	private AcademicDegree academicDegree;
	private List<Subject> subjects;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AcademicDegree getAcademicDegree() {
		return academicDegree;
	}
	public void setAcademicDegree(AcademicDegree academicDegree) {
		this.academicDegree = academicDegree;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
	
}
