package game.bases;
import java.util.Scanner;
import game.phases.*;

/**
 * This is the class for the main method
 * @author Leonel Fedric B. Tuburan
 */

public class Game {
	
	Scanner myScanner = new Scanner(System.in);
	
	/**
	 * This is where the game is executed mainly
	 * @param args [default for main method]
	 */
	
	public static void main(String[] args) {

		Scanner mainScanner = new Scanner(System.in);
		
		Game order = new Game();
		
		/*
		 * Instantiation of the phases of the game
		 */
		
		Intro intro = new Intro();
		Phase1 phase1 = new Phase1();
		Phase2 phase2 = new Phase2();
		Phase3 phase3 = new Phase3();
		Phase4 phase4 = new Phase4();
		Phase5 phase5 = new Phase5();
		Phase6 phase6 = new Phase6();
		Phase7 phase7 = new Phase7();
		Phase8 phase8 = new Phase8();
		Phase9 phase9 = new Phase9();
  		String playerName;
		
		int[] quantities = new int[4];
		quantities[0] = 100; // Variable for Sanity
		quantities[1] = 4; // Variable for Food Supply
		quantities[2] = 4; // Variable for Medicine Supply
		quantities[3] = 0; // Variable for Phase Number
		
		/*
		 * Variables for status of Letters, if they are Opened already
		 */
		
		boolean[] isOpened = new boolean[10];
		isOpened[0] = false;
		isOpened[1] = false;
		isOpened[2] = false;
		isOpened[3] = false;
		isOpened[4] = false;
		isOpened[5] = false;
		isOpened[6] = false;
		isOpened[7] = false;
		isOpened[8] = false;
		isOpened[9] = false;
		
		/*
		 * Variables for status of classmates' bodies, if they are Found already
		 */
		
		boolean[] isFound = new boolean[10];
		isFound[0] = false;
		isFound[1] = false;
		isFound[2] = false;
		isFound[3] = false;
		isFound[4] = false;
		isFound[5] = false;
		isFound[6] = false;
		isFound[7] = false;
		isFound[8] = false;
		isFound[9] = false;
		
		/*
		 * Variables for status of the clues, if they are Answered already
		 */
		
		boolean[] isAnswered = new boolean[8];
		isAnswered[0] = false;
		isAnswered[1] = false;
		isAnswered[2] = false;
		isAnswered[3] = false;
		isAnswered[4] = false;
		isAnswered[5] = false;
		isAnswered[6] = false;
		isAnswered[7] = false;
		
		/*
		 * Start of the game
		 */
		
		System.out.println("=================== WHAT'S THE ORDER? ===================");
		System.out.println("       Are you are smart enough to play this game?\n");
		
		order.keyEnter();
		
		System.out.println("TRIGGER WARNING: death, blood, murder, psychotic behavior");
		System.out.println("CAUTION: This is not the game for weakhearted and \"weakbrained\"\n");
		
		order.keyEnter();
		
		/*
		 * The player is asked about their name
		 * Repeats if entered name is blank
		 */
		
		do {
			System.out.println("Type your name: ");
			playerName = mainScanner.nextLine();
		}while(playerName.isBlank());
		
		System.out.println("\nHello, " + playerName + "!");
		System.out.println("Current Sanity: " + quantities[0]);
		System.out.println("NOTE: If Sanity becomes 0, player will get crazy and lose the game.\n");
		
		order.keyEnter();
		
		/*
		 * Start of Introduction
		 */
		
		intro.tellStory(playerName);
		
		/*
		 * Sequence of Phases
		 */
		phase1.tellStory(quantities, isOpened, isFound, isAnswered);
		phase2.tellStory(quantities, isOpened, isFound, isAnswered);
		phase3.tellStory(quantities, isOpened, isFound, isAnswered);
		phase4.tellStory(quantities, isOpened, isFound, isAnswered);
		phase5.tellStory(quantities, isOpened, isFound, isAnswered);
		phase6.tellStory(quantities, isOpened, isFound, isAnswered);
		phase7.tellStory(quantities, isOpened, isFound, isAnswered);
		phase8.tellStory(quantities, isOpened, isFound, isAnswered);
		phase9.tellStory(quantities, isOpened, isFound, isAnswered);
		
		mainScanner.close();
	}

	/**
	 * Method for Enter key. Stops the program for a while.
	 */
	
	public void keyEnter() {
		
		System.out.println("[press ENTER to continue]");
		myScanner.nextLine();
	}
	
	/**
	 * Method for verifying the choice of player from a set of choices
	 * Repeats if invalid input is entered
	 */
	
	/**
	 * 
	 * @param numOfChoices is variable corresponds to the number of choices
	 * @return choiceNum = the chosen Number of the user
	 */
	
	public int choose(int numOfChoices) {
		boolean choiceGiven = false;
		int choiceNum = 0;
		String checker = "";
		
		while(!choiceGiven) {
			
			do {
				System.out.println("Enter choice: ");
				checker = myScanner.nextLine();
			}while(checker.isBlank());
			
			try {
				choiceNum = Integer.parseInt(checker);
			}catch(NumberFormatException e) {
			}
			
			if(0 < choiceNum && choiceNum < numOfChoices + 1) {
				choiceGiven = true;
			}else {
				System.out.println("Invalid input");
			}
		}
		
		return choiceNum;
	}
}
