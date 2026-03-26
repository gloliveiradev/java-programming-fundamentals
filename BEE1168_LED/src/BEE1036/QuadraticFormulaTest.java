package BEE1036;

import org.junit.Assert;
import org.junit.Test;

/**
 * Defines the class QuadraticFormulaTest for this project.
 */
public class QuadraticFormulaTest {

	@Test
	public void shouldReturnDelta()
	{
		QuadraticFormula formula = new QuadraticFormula();
		double delta = formula.delta(1, 6, 3);
		Assert.assertEquals(24.0, delta, 0.0001);
	}
}
