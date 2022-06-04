package game.phases;
import game.bases.*;

/**
 * Class Intro executes the introduction of the game
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Intro extends Game{
	
	/**
	 * tells the Introduction of the Game
	 * @param playerName is the name of the player
	 */
	
	public void tellStory(String playerName){
		
		System.out.println("====================== INTRODUCTION ======================\n");
		
		System.out.println("Congratulations, " + playerName + "!");
		System.out.println("You are one of the Top 10 students of your class.\n");
	
		keyEnter();
	
		System.out.println("Top 10 of Class-A");
		System.out.println("1. Ramir John Vasa\n2. Alessandra Vivian Cortez\n3. Demitre Mendel");
		System.out.println("4. Gregoria Mendez\n5. Julia Prescott Jury\n6. Lothar King Mendey");
		System.out.println("7. Johannes Ginger\n7. " + playerName + " Kidman");
		System.out.println("8. Issa Cath Priston\n9. Rainie Desiree Carlos\n10. Democritus Eliot Erikson\n");
	
		keyEnter();
	
		System.out.println("As a celebration, you, together with the other top students, "
				+ "\ndecided to have a two-day outing in a secluded island where a lonely "
				+ "\nresthouse stands. A good place for having fun indeed :)\n");
	
		keyEnter();
	
		System.out.println("The first day was all games and activities, full of laughter: "
				+ "\nthe best prize for a year-long academic stress. But on the second day, "
				+ "\nlittle did you know that the real \"fun\" is about to start :)\n");
		
		keyEnter();
	}
}
