package Main;

import IComportamentoVoo.NeverFly;
import IcomportamentoSom.ArtificialSound;
import model.WoodenDuck;

/**
 * Defines the class App for this project.
 */
public class App {

	public static void main(String[] args) {
		WoodenDuck woodenDuck = new WoodenDuck();
		NeverFly neverFlyBehavior = new NeverFly();
		ArtificialSound artificialSoundBehavior = new ArtificialSound();
		woodenDuck.cS = artificialSoundBehavior;
		woodenDuck.cV = neverFlyBehavior;
		woodenDuck.cV.fly();
		woodenDuck.cS.makeSound();
	}
}
