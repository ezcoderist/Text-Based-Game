package game.phases;

import java.util.Scanner;

import game.bases.Game;
import game.envelope.Envelope4;
import game.user.Sanity;

/**
 * Class Phase4 executes the Phase 4 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase4 extends Game{
	
	/**
	 * tells the Phase 4 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {

		Scanner myScanner = new Scanner(System.in);
		Sanity sanity = new Sanity();
		String answer = "";
		Envelope4 env4 = new Envelope4();
		
		/*
		 * Executed if Envelope 4 is not yet opened
		 */
		
		if(hasOpened[3] == false) {
	
			System.out.println("======================== PHASE  4 ========================\n");
			
			quantities[3] = 4;
			
			System.out.println("You cannot proceed if you cannot answer the riddle.");
			
			while(!answer.equalsIgnoreCase("well")) {
				do {
					System.out.println("Enter the correct answer: ");
					answer = myScanner.nextLine();
				}while(answer.isBlank());
				if(!answer.equalsIgnoreCase("well")) {
					System.out.println("Your answer is wrong.\n");
					quantities[0] = sanity.Wrong(quantities[0]);
					if(quantities[0] <= 0) {
						sanity.Crazy();
					}
				}else {
					System.out.println("You got the correct answer.\n");
					quantities[0] = sanity.Correct(quantities[0]);
				}
			}
			
			System.out.println("You are now at the back of the house where a well is situated.\n");
			
			keyEnter();
			
			System.out.println("A hydrogen lamp is hung on the pole beside the well.\n"
					+ "It’s turned off since the sun is still up.\n");
			
			keyEnter();
				
			System.out.println("You noticed an envelope attached at the bottom of the lamp.\n");
			
			keyEnter();
			
			env4.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
			
			System.out.println("\n********************* END OF PHASE 4 *********************\n");
			
			keyEnter();
		}
	}
	
	
}
