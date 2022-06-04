package game.location;
import game.bases.User;
import game.envelope.Envelope7;
import game.user.*;

/**
 * Class OwnRoom executes the actions in Own Room 
 * @author Leonel Fedric B. Tuburan
 *
 */

public class OwnRoom extends Location{
	
	User player1 = new User();
	Sanity sanity = new Sanity();
	Envelope7 env7 = new Envelope7();
	
	/**
	 * Method goToOwnRoom brings the player to player's Own Room location
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */

	public void goToOwnRoom(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered){
		
		/*
		 * Executed only on Phase 7
		 */
		
		if(quantities[3] == 7) {
			System.out.println("You found an envelope placed on your bed.\n");
			keyEnter();
			env7.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
			
		/*
		 * Executed if player is not in Phase 7
		 */
			
		}else{
			System.out.println("You are inside your room.");
			System.out.println("There's nothing in here.\n");
			whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}
		
		
	}
	
	/**
	 * Method toWait is the action before the result comes out
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void toWait(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		System.out.println("You are inside your room now to wait for the result.\n");
		keyEnter();
		System.out.println("You heard a scream. Your answer is wrong.\n");
		quantities[0] = sanity.Wrong(quantities[0]);
		if(quantities[0] <= 0) {
			sanity.Crazy();
		}
		hasOpened[9] = true;
		whereToGo(quantities, hasOpened, hasFound, hasAnswered);
	}
	
}
