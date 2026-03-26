import org.junit.Assert;
import org.junit.jupiter.api.Test;

import models.Calculator;

/**
 * Defines the class CalculatorTest for this project.
 */
public class CalculatorTest {
	@Test
	public void shouldAddTwoNumbers()
	{
		Calculator cal = new Calculator();
		int sum = cal.add(7, 3);
		Assert.assertEquals(10, sum);
	}
	
	@Test
	public void shouldSubtractTwoNumbers()
	{
		Calculator cal = new Calculator();
		int subtraction = cal.subtract(7, 3);
		Assert.assertEquals(4, subtraction);
	}
	
	@Test
	public void shouldMultiplyTwoNumbers()
	{
		Calculator cal = new Calculator();
		int multiplication = cal.multiply(7, 3);
		Assert.assertEquals(21, multiplication);
	}
	
	@Test
	public void shouldDivideTwoNumbers()
	{
		Calculator cal = new Calculator();
		double division = cal.divide(7, 3);
		Assert.assertEquals(7.0 / 3.0, division, 0.0001);
	}
}
