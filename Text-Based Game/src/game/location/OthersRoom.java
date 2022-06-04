package game.location;
import game.bases.User;
import game.user.*;

/**
 * Class OthersRoom executes the actions in Others' Rooms
 * @author Leonel Fedric B. Tuburan
 *
 */

public class OthersRoom extends Location{
	
	User player1 = new User();
	
	/**
	 * Method goToOthersRoom brings the player to the Others' Room location
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void goToOthersRoom(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		System.out.println("You went to your classmates' rooms.");
		System.out.println("You found nobody.\n");
		
		whereToGo(quantities, hasOpened, hasFound, hasAnswered);
	}
}
