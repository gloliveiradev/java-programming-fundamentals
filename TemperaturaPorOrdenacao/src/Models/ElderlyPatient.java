package Models;

import IOrdenacao.Sorting;

/**
 * Defines the class ElderlyPatient for this project.
 */
public class ElderlyPatient extends Patient {

	public ElderlyPatient(Sorting sorting, int id, String name, Double[] temperaturesDuringDay) {
		super(sorting, id, name, temperaturesDuringDay);
	}
}
