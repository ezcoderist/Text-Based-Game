package game.phases;

import game.bases.Game;
import game.user.Location;

/**
 * Class Phase8 executes the Phase 8 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase8 extends Game{
	
	/**
	 * tells the Phase 8 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		Location location = new Location();
		
		/*
		 * Executed if Envelope 8 is not yet opened
		 */
		
		if(hasOpened[7] == false) {
	
			System.out.println("======================== PHASE  8 ========================\n");
			quantities[3] = 8;
			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
			
		}else {
			
			/*
			 * Executed if Envelope 8 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 8 *********************\n");
			keyEnter();
		}
	}
}
