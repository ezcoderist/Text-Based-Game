package game.user;
import game.bases.*;
import game.location.*;
import java.util.Scanner;

/**
 * Manages the location of the player
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Location extends Game{
	
	/**
	 * myScanner instantiated Scanner
	 */
	
	public Scanner myScanner = new Scanner(System.in);
	
	/**
	 * sanity instantiated Sanity
	 */
	
	public Sanity sanity = new Sanity();
	
	/**
	 * resources instantiated Resources
	 */
	
	public Resources resources = new Resources();
	
	/*
	 * Method whereToGo asks the player where they desire to go
	 */
	
	/**
	 * Asks the user where they want to go
	 * @param quantities for the quantities
	 * @param hasOpened if the envelopes are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void whereToGo(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		ComfortRoom cr = new ComfortRoom();
		DiningArea da = new DiningArea();
		LivingRoom lr = new LivingRoom();
		OthersRoom otr = new OthersRoom();
		OwnRoom or = new OwnRoom();
		
		System.out.println("Where should you go?");
		System.out.println("[1] Own Room\n[2] Others' Room\n[3] "
				+ "Dining Area\n[4] Living Room\n[5] Comfort Room");
		
		int choice = choose(5);
		
		switch(choice) {
		case 1:
			or.goToOwnRoom(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 2:
			otr.goToOthersRoom(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 3:
			da.goToDiningArea(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 4:
			lr.goToLivingRoom(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 5:
			cr.goToComfortRoom(quantities, hasOpened, hasFound, hasAnswered);
			break;
		}
	}
}
