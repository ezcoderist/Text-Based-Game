package game.phases;
import game.bases.*;
import game.user.Location;

/**
 * Class Phase2 executes the Phase 2 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase2 extends Game{
	
	/**
	 * tells the Phase 2 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {

		Location location = new Location();
		
		/*
		 * Executed if Envelope 2 is not yet opened
		 */
		
		if(hasOpened[1] == false) {
	
			System.out.println("======================== PHASE  2 ========================\n");
		
			quantities[3] = 2;

			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}else {
			
			/*
			 * Executed if Envelope 2 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 2 *********************\n");
			keyEnter();
		}
	}
}
