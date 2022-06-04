package game.phases;

import game.bases.Game;
import game.user.Location;

/**
 * Class Phase7 executes the Phase 7 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase7 extends Game{
	
	/**
	 * tells the Phase 7 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {

		Location location = new Location();
		
		/*
		 * Executed if Envelope 7 is not yet opened
		 */
	
		if(hasOpened[6] == false) {

			System.out.println("======================== PHASE  7 ========================\n");
			quantities[3] = 7;
			System.out.println("You heard a loud thump upstairs where the rooms are.\n");

			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
			
		}else {
			
			/*
			 * Executed if Envelope 7 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 7 *********************\n");
			keyEnter();
		
		}
	}
}
