package IComportamentoVoo;

/**
 * Defines the class FlyWithWings for this project.
 */
public class FlyWithWings implements FlightBehavior {
	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}
	
	public FlyWithWings() {
	
	}
}
