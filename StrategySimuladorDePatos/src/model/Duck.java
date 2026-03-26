package model;

import IComportamentoVoo.FlightBehavior;
import IcomportamentoSom.SoundBehavior;

/**
 * Defines the class Duck for this project.
 */
public class Duck {
	public SoundBehavior cS;
	public FlightBehavior cV;
	
	public void swim( ) {
		System.out.println("Swimming...");
	}
	
	public void display() {
		System.out.println("I am a duck...");
	}
}
