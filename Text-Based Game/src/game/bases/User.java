package game.bases;

/**
 * This manages the different quantities related to the game
 * @author Leonel Fedric B. Tuburan
 */

public class User {
	
	/* Encapsulation
	 * Setter and Getter of values
	 */
	
	private int playerSanity;
	private int playerFood;
	private int playerMeds;
	private int playerPhase;
	
	/**
	 * gives the current Sanity value
	 * @return Sanity value
	 */
	
	public int getSanity() {
		return playerSanity;
	}
	
	/**
	 * sets the new Sanity value
	 * @param newPlayerSanity the current Sanity value
	 */
	
	public void setSanity(int newPlayerSanity) {
		this.playerSanity = newPlayerSanity;
	}
	
	/**
	 * gives the current Food Supply
	 * @return Food Supply
	 */
	
	public int getFood() {
		return playerFood;
	}
	
	/**
	 * sets the new Food Supply
	 * @param newPlayerFood the current Food Supply
	 */
	
	public void setFood(int newPlayerFood) {
		this.playerFood = newPlayerFood;
	}
	
	/**
	 * gives the current Medicine Supply
	 * @return Medicine Supply
	 */
	
	public int getMeds() {
		return playerMeds;
	}
	
	/**
	 * sets the new Medicine Supply
	 * @param newPlayerMeds the current Medicine Supply
	 */
	
	public void setMeds(int newPlayerMeds) {
		this.playerMeds = newPlayerMeds;
	}
	
	/**
	 * gives the current Phase Number
	 * @return Phase Number 
	 */
	
	public int getPhase() {
		return playerPhase;
	}
	
	/**
	 * sets the new Phase Number
	 * @param newPlayerPhase the current Phase Number
	 */
	
	public void setPhase(int newPlayerPhase) {
		this.playerPhase = newPlayerPhase;
	}
}
