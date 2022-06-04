package game.phases;

import game.bases.Game;
import game.user.Location;

/**
 * Class Phase6 executes the Phase 6 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase6 extends Game{
	
	/**
	 * tells the Phase 6 of the game
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
	
		if(hasOpened[5] == false) {

			System.out.println("======================== PHASE  6 ========================\n");
	
			quantities[3] = 6;

			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}else {
			
			/*
			 * Executed if Envelope 6 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 6 *********************\n");
			keyEnter();
		
		}
	}
}
