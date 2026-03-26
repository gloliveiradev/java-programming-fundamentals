package br.computacao.aulapoo.models;

/**
 * Defines the class Subject for this project.
 */
public class Subject {
	private int Id;
	private String Name;
	private Professor Professor;
	public Subject(int id, String name, Professor professor) {
		Id = id;
		Name = name;
		Professor = professor;
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
	public Professor getProfessor() {
		return Professor;
	}
	public void setProfessor(Professor professor) {
		Professor = professor;
	}
}
