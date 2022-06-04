package game.phases;
import game.bases.*;
import game.user.*;

/**
 * Class Phase1 executes the Phase 1 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase1 extends Game{
	
	/**
	 * tells the Phase 1 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {

		Location location = new Location();
		
		/*
		 * Executed if Envelope 1 is not yet opened
		 */
		
		if(hasOpened[0] == false) {
	
			System.out.println("======================== PHASE  1 ========================\n");
		
			quantities[3] = 1;
			
			System.out.println("You woke up and immediately noticed the defeaning silence which is odd.\n");			
			keyEnter();
			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}else {
			
			/*
			 * Executed if Envelope 1 is opened
			 */
			
			System.out.println("\n********************* END OF PHASE 1 *********************\n");
			keyEnter();
		}
	}
}
