package game.user;
import game.bases.*;

/**
 * Abstraction
 * @author Leonel Fedric B. Tuburan
 *
 */

interface ResourcesCheck{
	
	/**
	 * Eat diminishes Food Supply
	 * @param food current Food Supply
	 * @return new Food Supply
	 */
	
	int Eat(int food);
	
	/**
	 * Take diminishes Medicine Supply
	 * @param meds current Medicine Supply
	 * @return new Medicine Supply
	 */
	
	int Take(int meds);
}

/**
 * class resources implements ResourcesCheck
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Resources extends User implements ResourcesCheck{

	/**
	 * Method Eat decreases the supply of food by 1 
	 */
	
	public int Eat(int food) {
		setFood(food - 1);
		System.out.println("Current Food: " + getFood() + "\n");
		return getFood();
	}
	
	/**
	 * Method Take decreases the supply of food by 1
	 */
	
	public int Take(int meds) {
		setMeds(meds - 1);
		System.out.println("Current Medicines: " + getMeds() + "\n");
		return getMeds();
	}
	
}
