package BEE1036;

/**
 * Defines the class QuadraticFormula for this project.
 */
public class QuadraticFormula {
	public double delta(double a, double b, double c)
	{
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public double firstRoot(double a, double b, double c, double delta)
	{
		return ((-b + Math.sqrt(delta)) / (2 * a));
	}
	
	public double secondRoot(double a, double b, double c, double delta)
	{
		return ((-b - Math.sqrt(delta)) / (2 * a));
	}
}
