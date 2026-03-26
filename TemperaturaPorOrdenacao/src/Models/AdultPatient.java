package Models;

import IOrdenacao.Sorting;

/**
 * Defines the class AdultPatient for this project.
 */
public class AdultPatient extends Patient {

	public AdultPatient(Sorting sorting, int id, String name, Double[] temperaturesDuringDay) {
		super(sorting, id, name, temperaturesDuringDay);
	}
}
