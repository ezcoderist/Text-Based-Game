package game.envelope;

import game.bases.User;
import game.phases.*;

/**
 * Polymorphism
 * Parent class of other envelope classes found in Package game.envelope
 * Method openEnvelope is overridden in other envelope classes
 * @author Leonel Fedric B. Tuburan
 */

public class Envelope {
	
	Phase1 ps1 = new Phase1();
	Phase2 ps2 = new Phase2();
	Phase3 ps3 = new Phase3();
	Phase4 ps4 = new Phase4();
	Phase5 ps5 = new Phase5();
	Phase6 ps6 = new Phase6();
	Phase7 ps7 = new Phase7();
	Phase8 ps8 = new Phase8();
	Phase9 ps9 = new Phase9();
	User player1 = new User();
	
	/**
	 * This is the parent class of other Envelope subclasses
	 */
	
	public void openEnvelope() {

		System.out.println("Open an envelope to read a letter.");
	}
}
