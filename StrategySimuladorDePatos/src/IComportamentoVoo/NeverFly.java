package IComportamentoVoo;

/**
 * Defines the class NeverFly for this project.
 */
public class NeverFly implements FlightBehavior {
	@Override
	public void fly() {
		System.out.println("Never fly");
	}
	public NeverFly () {
		
	}
}
