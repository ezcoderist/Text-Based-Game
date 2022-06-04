package game.location;
import game.user.*;
import game.bases.*;
import game.envelope.*;


/**
 * Class ComfortRoom executes the actions in Comfort Room 
 * @author Leonel Fedric B. Tuburan
 *
 */

public class ComfortRoom extends Location{
	
	Game order = new Game();
	User player1 = new User();
	Envelope1 env1 = new Envelope1();
	Sanity sanity = new Sanity();
	
	/**
	 * Method goToComfortRoom brings the player to the Comfort Room location
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */

	public void goToComfortRoom(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		/*
		 * The following if block is executed only in Phase 1
		 * Once Democritus' body is found, it's not executed anymore
		 */
		
		if (hasFound[0] == false) {
			System.out.println("You found Democritus inside the comfort room - bathing in his own blood.\n");
			hasFound[0] = true;
			quantities[0] = sanity.Death(quantities[0]);
			if(quantities[0] <= 0) {
				sanity.Crazy();
			}
			
			keyEnter();
			
			System.out.println("There is a bloody envelope on the sink.");
			System.out.println("There is a bloody writing on the wall: \"-460\"\n");
			
			keyEnter();
			
			whatToDoCR(quantities, hasOpened, hasFound, hasAnswered);
			
			/*
			 * Executed if Envelope1 is not yet opened or player is not in Phase 1
			 */
			
			if(hasOpened[0] == false || quantities[3] != 1) {
				whereToGo(quantities, hasOpened, hasFound, hasAnswered);
			}			
		}else {
			
			/*
			 * This is executed in Comfort Room once Democritus' body is found
			 */
			
			System.out.println("The dead body of Democritus is there.");
			System.out.println("The bloody writing on the wall is: \"-460\"\n");
			
			/*
			 * Executed if Envelope1 is not yet opened
			 */

			if(hasOpened[0] == false) {
				whatToDoCR(quantities, hasOpened, hasFound, hasAnswered);
			}
			
			/*
			 * Executed if Envelope1 is not yet opened or player is not in Phase 1
			 */
			
			if(hasOpened[0] == false || quantities[3] != 1) {
				whereToGo(quantities, hasOpened, hasFound, hasAnswered);
			}
		}
	}
	
	/**
	 * Method whatToDoCR are commands found in Comfort Room
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void whatToDoCR(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		System.out.println("What should you do?");
		System.out.println("[1] Scream for help\n[2] Cry out loud\n"
				+ "[3] Check the envelope\n[4] Leave Comfort Room");

		int choice = choose(4);
		
		switch(choice) {
		case 1: 
			System.out.println("You screamed but nobody answered.\n");
			quantities[0] = sanity.Scream(quantities[0]);
			if(quantities[0] <= 0) {
				sanity.Crazy();
			}
			whatToDoCR(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 2:
			System.out.println("You cried loudly.\n");
			keyEnter();
			System.out.println("You stopped crying.\n");
			quantities[0] = sanity.Cry(quantities[0]);
			whatToDoCR(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 3: 
			env1.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
			System.out.println();
			if(hasOpened[0] == false || quantities[3] != 1) {
				whatToDoCR(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
		case 4:
			System.out.println("You left the Comfort Room.\n");
			break;
		}
	}
}
