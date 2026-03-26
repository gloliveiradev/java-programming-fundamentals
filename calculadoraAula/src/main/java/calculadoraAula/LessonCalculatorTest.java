package calculadoraAula;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Defines the class LessonCalculatorTest for this project.
 */
public class LessonCalculatorTest {
	
	@Test
	public void shouldAddTwoNumbers()
	{
		LessonCalculator cal = new LessonCalculator();
		int sum = cal.add(7, 3);
		Assert.assertEquals(10, sum);
	}
	
	@Test
	public void shouldSubtractTwoNumbers()
	{
		LessonCalculator cal = new LessonCalculator();
		int subtraction = cal.subtract(7, 3);
		Assert.assertEquals(4, subtraction);
	}
	
	@Test
	public void shouldMultiplyTwoNumbers()
	{
		LessonCalculator cal = new LessonCalculator();
		int multiplication = cal.multiply(7, 3);
		Assert.assertEquals(21, multiplication);
	}
	
	@Test
	public void shouldDivideTwoNumbers()
	{
		LessonCalculator cal = new LessonCalculator();
		double division = cal.divide(7, 3);
		Assert.assertEquals(7.0 / 3.0, division, 0.0001);
	}
}
