package IOrdenacao;

/**
 * Defines the class BubbleSortMethod for this project.
 */
public class BubbleSortMethod implements Sorting{
	
	@Override
	public Double[] sortMethod(Double[] values) {
		boolean swapped = true;
        double aux;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < values.length - 1; i++) {
                if (values[i] > values[i + 1]) {
                    aux = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = aux;
                    swapped = true;
                }
            }
        }
        return values;
	}

}
