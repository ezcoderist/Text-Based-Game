package game.location;

import game.user.*;

/**
 * Class DiningArea executes the actions in Dining Area
 * @author Leonel Fedric B. Tuburan
 *
 */

public class DiningArea extends Location {
	
	/**
	 * Method goToDiningArea brings the player to the Dining Area location
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */

	public void goToDiningArea(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		System.out.println("You are in the dining area.\n");
		whatToDoDA(quantities, hasOpened, hasFound, hasAnswered);
		whereToGo(quantities, hasOpened, hasFound, hasAnswered);
	}
	
	/**
	 * Method whatToDoDA are commands found in Dining Area
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void whatToDoDA(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		System.out.println("What should you do?");
		System.out.println("[1] Eat (+5 Sanity)\n[2] Take Anti-Depressants (+10 Sanity)\n"
				+ "[3] Leave Dining Area");
		
		int choice = choose(3);
		
		switch(choice) {
		case 1: 
			if(quantities[1] != 0) {
				System.out.println("You ate.\n");
				quantities[0] = sanity.Eat(quantities[0]);
				quantities[1] = resources.Eat(quantities[1]);
			}else {
				System.out.println("No more food left.\n");
			}
			whatToDoDA(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 2: 
			if(quantities[2] != 0) {
				System.out.println("You took medicine.\n");
				quantities[0] = sanity.Take(quantities[0]);
				quantities[2] = resources.Take(quantities[2]);
			}else {
				System.out.println("No more medicines left.\n");
			}
			whatToDoDA(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 3:
			System.out.println("You left the dining area.\n");
			break;
		}
	}
}
