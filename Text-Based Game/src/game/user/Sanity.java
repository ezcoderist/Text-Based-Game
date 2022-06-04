package game.user;
import game.bases.*;

/**
 * Abstraction
 * @author Leonel Fedric B. Tuburan
 *
 */

interface sanityCheck{
	
	/**
	 * Eat strengthens Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Eat(int playerSanity);
	
	/**
	 * Take strengthens Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Take(int playerSanity);
	
	/**
	 * Death diminishes Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Death(int playerSanity);
	
	/**
	 * Scream diminishes Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Scream(int playerSanity);
	
	/**
	 * Cry strengthens Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Cry(int playerSanity);
	
	/**
	 * Wrong diminishes Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Wrong(int playerSanity);
	
	/**
	 * Correct strengthens Sanity value
	 * @param playerSanity current Sanity value
	 * @return new Sanity value
	 */
	
	int Correct(int playerSanity);
	
	/**
	 * Ends the game if Sanity value = 0
	 */
	
	void Crazy();
	
	/**
	 * eat adds 5 Sanity value
	 */
	
	int eat = 5;
	
	/**
	 * take adds 10 Sanity value
	 */
	
	int take = 10;
	
	/**
	 * death subtracts 5 Sanity value
	 */
	
	int death = -5;
	
	/**
	 * scream subtracts 3 Sanity value
	 */
	
	int scream = -3;
	
	/**
	 * cry adds 1 Sanity value
	 */
	
	int cry = 1;
	
	/**
	 * wrong subtracts 5 Sanity value
	 */
	
	int wrong = -5;
	
	/**
	 * correct adds 7 Sanity value
	 */
	
	int correct = 7;
}

/**
 * Sanity implements method in interface sanityCheck
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Sanity extends User implements sanityCheck{
	
	/*
	 * Adds 5 Sanity
	 */
	
	public int Eat(int playerSanity) {
		setSanity(playerSanity + eat);
		System.out.println("Sanity is increased by " + eat);
		System.out.println("Current Sanity: " + getSanity());
		return getSanity();
	}
	
	/*
	 * Adds 10 Sanity
	 */
	
	public int Take(int playerSanity) {
		setSanity(playerSanity + take);
		System.out.println("Sanity is increased by " + take);
		System.out.println("Current Sanity: " + getSanity());
		return getSanity();
	}
	
	/*
	 * Subtracts 5 Sanity
	 */
	
	public int Death(int playerSanity) {
		setSanity(playerSanity + death);
		if(getSanity() <= 0) {
			
		}
		System.out.println("Sanity is decreased by " + -death );
		System.out.println("Current Sanity: " + getSanity() + "\n");
		return getSanity();
	}
	
	/*
	 * Subtracts 3 Sanity
	 */
	
	public int Scream(int playerSanity) {
		setSanity(playerSanity + scream);
		System.out.println("Sanity is decreased by " + -scream);
		System.out.println("Current Sanity: " + getSanity() + "\n");
		return getSanity();
	}
	
	/*
	 * Adds 1 Sanity
	 */
	
	public int Cry(int playerSanity) {
		setSanity(playerSanity + cry);
		System.out.println("Sanity is increased by " + cry);
		System.out.println("Current Sanity: " + getSanity() + "\n");
		return getSanity();
	}
	
	/*
	 * Subtracts 5 Sanity
	 */
	
	public int Wrong(int playerSanity) {
		setSanity(playerSanity + wrong);
		System.out.println("Sanity is decreased by " + -wrong);
		System.out.println("Current Sanity: " + getSanity() + "\n");
		return getSanity();
	}
	
	/*
	 * Adds 7 Sanity
	 */
	
	public int Correct(int playerSanity) {
		setSanity(playerSanity + correct);
		System.out.println("Sanity is increased by " + correct);
		System.out.println("Current Sanity: " + getSanity() + "\n");
		return getSanity();
	}
	
	/*
	 * If Sanity <= 0, player must have gone crazy and so you lose the game.
	 */
	
	public void Crazy() {
		System.out.println("Your sanity has run out. You have gone crazy.");
		System.out.println("You lost the game.");
		System.exit(0);
	}
}
