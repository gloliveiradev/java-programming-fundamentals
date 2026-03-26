package IOrdenacao;

/**
 * Defines the class SelectionSortMethod for this project.
 */
public class SelectionSortMethod implements Sorting {

	@Override
	public Double[] sortMethod(Double[] values) {
        for (int fixo = 0; fixo < values.length - 1; fixo++) {
            int smallest = fixo;
            for (int i = smallest + 1; i < values.length; i++) {
                if (values[i] < values[smallest]) {
                    smallest = i;
                }
            }

            if (smallest != fixo) {
            	Double t = values[fixo];
                values[fixo] = values[smallest];
                values[smallest] = t;
            }
        }

        return values;
	}

}
