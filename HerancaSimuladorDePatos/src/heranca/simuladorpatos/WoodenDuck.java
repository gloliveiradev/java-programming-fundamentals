package heranca.simuladorpatos;

/**
 * Defines the class WoodenDuck for this project.
 */
public class WoodenDuck extends Duck {

	public void display() {
		System.out.println("I am a wooden duck!");
	}
	
	@Override public void fly () {
		System.out.println("The duck is not flying...");
	}
}
