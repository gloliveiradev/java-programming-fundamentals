package Models;

import IOrdenacao.Sorting;

/**
 * Defines the class ChildPatient for this project.
 */
public class ChildPatient extends Patient {

	public ChildPatient(Sorting sorting, int id, String name, Double[] temperaturesDuringDay) {
		super(sorting, id, name, temperaturesDuringDay);
	}
}
