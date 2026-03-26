package IcomportamentoSom;

/**
 * Defines the class LoudSound for this project.
 */
public class LoudSound implements SoundBehavior {
	@Override
	public void makeSound() {
		System.out.println("Loud duck sound");
	}
}
