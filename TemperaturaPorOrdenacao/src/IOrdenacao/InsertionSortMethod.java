package IOrdenacao;

/**
 * Defines the class InsertionSortMethod for this project.
 */
public class InsertionSortMethod implements Sorting {

	@Override
	public Double[] sortMethod(Double[] values) {
        int j, i;
        Double aux;
        
        for (j = 1; j < values.length; j++) {
            aux = values[j];
            for (i = j - 1; (i >= 0) && (values[i] > aux); i--) {
                values[i + 1] = values[i];
            }
            values[i + 1] = aux;
        }
        return values;
	}
}
