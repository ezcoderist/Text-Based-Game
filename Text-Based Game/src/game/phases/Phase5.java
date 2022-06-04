package game.phases;

import game.bases.Game;
import game.user.Location;

/**
 * Class Phase5 executes the Phase 5 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase5 extends Game{
	
	/**
	 * tells the Phase 5 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {

		Location location = new Location();
		
		/*
		 * Executed if Envelope 5 is not yet opened
		 */
	
		if(hasOpened[4] == false) {

			System.out.println("======================== PHASE  5 ========================\n");
	
			quantities[3] = 5;

			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}else {
			
			/*
			 * Executed if Envelope 1 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 5 *********************\n");
			keyEnter();
		
		}
	}
}
