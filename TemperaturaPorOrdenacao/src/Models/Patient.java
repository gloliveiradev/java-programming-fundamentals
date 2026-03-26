package Models;

import IOrdenacao.Sorting;

/**
 * Defines the class Patient for this project.
 */
public class Patient {
	private Sorting sorting;
	private int Id;
	private String Name;
	public Patient(Sorting sorting, int id, String name, Double[] temperaturesDuringDay) {
		super();
		this.sorting = sorting;
		Id = id;
		Name = name;
		TemperaturesDuringDay = temperaturesDuringDay;
	}

	public Sorting getSorting() {
		return sorting;
	}

	public void setSorting(Sorting sorting) {
		this.sorting = sorting;
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

	public Double[] getTemperaturesDuringDay() {
		return TemperaturesDuringDay;
	}

	public void setTemperaturesDuringDay(Double[] temperaturesDuringDay) {
		TemperaturesDuringDay = temperaturesDuringDay;
	}

	private Double[] TemperaturesDuringDay = new Double[10];
	
	public void sortTemperatures() {
		sorting.sortMethod(TemperaturesDuringDay);
	}
}
