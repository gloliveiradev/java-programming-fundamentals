package calculadoraAula;

import java.text.DecimalFormat;

/**
 * Defines the class App for this project.
 */
public class App {

	public static void main(String[] args) {
		LessonCalculator calculator = new LessonCalculator();
		
		System.out.println(calculator.add(10, 2));
		
		System.out.println(calculator.subtract(10, 2));
		
		System.out.println(calculator.multiply(10, 2));
		
		DecimalFormat formatter = new DecimalFormat();
		formatter.setMaximumFractionDigits(2);
		double result = calculator.divide(10, 3);
		System.out.println(formatter.format(result));

	}

}
