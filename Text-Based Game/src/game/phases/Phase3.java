package game.phases;

import game.bases.Game;
import game.user.Location;

/**
 * Class Phase3 executes the Phase 3 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase3 extends Game{
	
	/**
	 * tells the Phase 3 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {

		Location location = new Location();
		
		/*
		 * Executed if Envelope 3 is not yet opened
		 */
		
		if(hasOpened[2] == false) {
	
			System.out.println("======================== PHASE  3 ========================\n");
		
			quantities[3] = 3;

			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}else {
			
			/*
			 * Executed if Envelope 3 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 3 *********************\n");
			keyEnter();
		}
	}
}
