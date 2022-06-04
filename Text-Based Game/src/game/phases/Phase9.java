package game.phases;

import java.util.Scanner;

import game.bases.Game;
import game.envelope.Envelope9;
import game.location.LivingRoom;
import game.user.Location;
import game.user.Sanity;

/**
 * Class Phase9 executes the Phase 9 of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Phase9 extends Game{
	
	/**
	 * tells the Phase 9 of the game
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if the bodies are found
	 * @param hasAnswered if the clues are answered
	 */
	
	public void tellStory(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		/*
		 * Instantiations that will be used later
		 */
		
		Location location = new Location();
		Scanner myScanner = new Scanner(System.in);
		Sanity sanity = new Sanity();
		String answer = "";
		LivingRoom lr = new LivingRoom();
		Envelope9 env9 = new Envelope9();
		
		/*
		 * Executed only if the Envelope 9 is not yet opened
		 */
		
		if(hasOpened[8] == false) {
			
			System.out.println("======================== PHASE  9 ========================\n");
			quantities[3] = 9;
			location.whereToGo(quantities, hasOpened, hasFound, hasAnswered);
	
			System.out.println("You cannot proceed if you cannot answer the riddle.");
			
			while(!answer.equalsIgnoreCase("sea")) {
				do{
					System.out.println("Enter the correct answer: ");
					answer = myScanner.nextLine();
				}while(answer.isBlank());
				if(!answer.equalsIgnoreCase("sea")) {
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
			
			System.out.println("You are now at the beachside.\n"
					+ "You found a boat on the water meters away from you.\n"
					+ "On the boat is the culprit, fully covered with clothes to hide their identity.\n"
					+ "With them are the unconscious bodies of your two remaining friends: \n"
					+ "Johannes and Ramir.\n");
			
			keyEnter();
			
			System.out.println("Culprit: Hello there! This is your last chance in our little game.\n"
					+ "         There is an envelope on the boulder on your left.\n"
					+ "         The last clues are written there.\n");
			
			keyEnter();
				
			System.out.println("You roamed your eyes and immediately spotted the envelope.\n");
			
			keyEnter();
			
			env9.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
			System.out.println();
			
			lr.askOrder();
			
			/*
			 * Executed if player got the wrong answer
			 */
			
			System.out.println("You’re the loser in this game!\n"
					+ "You’re such a bad classmate!\n"
					+ "You have saved no one!\n"
					+ "I won! BWAHAHAHAHAHAHAAA!");
		}
	}
}
