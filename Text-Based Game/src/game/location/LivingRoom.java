package game.location;

import java.util.Scanner;

import game.bases.Game;
import game.envelope.*;
import game.user.*;

/**
 * Class LivingRoom executes the actions in Living Room 
 * @author Leonel Fedric B. Tuburan
 *
 */

public class LivingRoom extends Location{
	
	/*
	 * Instantiations that will be used in location Living Room
	 */
	
	Scanner myScanner = new Scanner(System.in);
	OwnRoom or = new OwnRoom();
	Envelope2 env2 = new Envelope2();
	Envelope3 env3 = new Envelope3();
	Envelope5 env5 = new Envelope5();
	Envelope6 env6 = new Envelope6();
	Envelope8 env8 = new Envelope8();
	Game order = new Game();
	
	/**
	 * Method goToLivingRoom brings the player to the Living Room location
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */

	public void goToLivingRoom(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		System.out.println("You are in the living room.\n");
		switch(quantities[3]) {
		
		/*
		 * Executed only in Phase 1
		 */
		
		case 1: 
			System.out.println("You found no one.\n");
			whereToGo(quantities, hasOpened, hasFound, hasAnswered);
			break;
			
		/*
		 * Executed only in Phase 2
		 */
			
		case 2:
			if(hasOpened[9] == false) {
				askOrder();
				or.toWait(quantities, hasOpened, hasFound, hasAnswered);
			}else if(hasFound[1] == false){
				
				/*
				 * Executed if Rainie's body is not yet found
				 */
				
				System.out.println("There, you found your dead classmate Rainie.\n"
						+ "A bloody scribble on her forehead is visible: \"1650\".\n");
				hasFound[1] = true;
				quantities[0] = sanity.Death(quantities[0]);
				
				keyEnter();
				
				System.out.println("There is a bloody envelope beside her.\n");
				
				keyEnter();
				
				env2.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
				System.out.println();
			}
			break;
			
		/*
		 * Executed only on Phase 3
		 */
			
		case 3:	
			
			/*
			 * Executed if Issa's body is not yet found
			 */
			
			if(hasOpened[9] != false && hasFound[2] == false) {
				System.out.println("There, you found your dead classmate, Issa.\n");
				hasFound[2] = true;
				quantities[0] = sanity.Death(quantities[0]);
				
				keyEnter();
				
				System.out.println("There is a bloody envelope beside her.\n");
				
				keyEnter();
				
				env3.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
				System.out.println();
			}
			
			/*
			 * Executed if Envelope 3 is not yet opened
			 */
			
			if(hasOpened[2] == false || quantities[3] != 3) {
				System.out.println("The dead body of Rainie is there.");
				System.out.println("The bloody scribble on Rainie's forehead is: \"1650\"\n");
				whatToDoLR(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
			
		/*
		 * Executed only on Phase 5
		 */
			
		case 5:
			
			/*
			 * Executed if Alessandra's body is not yet found
			 */
			
			if(hasOpened[9] != false && hasFound[4] == false) {
				
				System.out.println("There, you found your dead classmate, Alessandra.\n");
				hasFound[4] = true;
				quantities[0] = sanity.Death(quantities[0]);
				
				keyEnter();
				
				System.out.println("There is a bloody envelope beside her.\n");
				
				keyEnter();
				
				env5.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
				System.out.println();
			}
			
			/*
			 * Executed if Envelope 5 is not yet opened
			 */
			
			if(hasOpened[4] == false || quantities[3] != 5) {
				System.out.println("The dead bodies of Rainie and Issa are there.");
				System.out.println("The bloody scribble on Rainie's forehead is: \"1650\"\n");
				whatToDoLR(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
			
		/*
		 * Executed only on Phase 6
		 */
			
		case 6:
			
			/*
			 * Executed if Gregoria's and Julia's body is not yet found
			 */
			
			if(hasOpened[9] != false && hasFound[5] == false) {
				System.out.println("There, you found your dead classmates, Gregoria and Julia.\n");
				hasFound[5] = true;
				quantities[0] = sanity.Death(quantities[0]);
				
				keyEnter();
				
				System.out.println("There is a bloody envelope beside them.\n");
				
				keyEnter();
				
				env6.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
				System.out.println();
			}
			
			/*
			 * Executed only if Envelope 6 is not yet opened
			 */
			
			if(hasOpened[5] == false || quantities[3] != 6) {
				System.out.println("The dead bodies of Rainie, Issa, and Alessandra are there.");
				System.out.println("The bloody scribble on Rainie's forehead is: \"1650\"\n");
				whatToDoLR(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
			
		/*
		 * Executed only on Phase 7
		 */
			
		case 7:
			
			/*
			 * Executed if Envelope 7 is not yet opened
			 */
			
			if(hasOpened[6] == false || quantities[3] != 7) {
				System.out.println("The dead bodies of Rainie, Issa, Alessandra, "
						+ "and Gregoria and Julia are there.");
				System.out.println("The bloody scribble on Rainie's forehead is: \"1650\"\n");
				whereToGo(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
			
		/*
		 * Executed only on Phase 8
		 */
			
		case 8:
			
			/*
			 * Executed if Demitre's and Lothar's bodies are not yet found
			 */
			
			if(hasOpened[9] != false && hasFound[7] == false) {
				System.out.println("There, you found your dead classmates, Demitre and Lothar.\n");
				hasFound[7] = true;
				quantities[0] = sanity.Death(quantities[0]);
				
				keyEnter();
				
				System.out.println("There is a bloody envelope beside them.\n");
				
				keyEnter();
				
				env8.openEnvelope(quantities, hasOpened, hasFound, hasAnswered);
				System.out.println();
			}
			
			/*
			 * Executed if Envelope 8 is not yet opened
			 */
			
			if(hasOpened[7] == false || quantities[3] != 8) {
				System.out.println("The dead bodies of Rainie, Issa, Alessandra, "
						+ "and Gregoria and Julia are there.");
				System.out.println("The bloody scribble on Rainie's forehead is: \"1650\"\n");
				whatToDoLR(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
		}
	}
	
	/**
	 * The method that asks the user for its answer (i.e. the planned order of killings)
	 * It only accepts 10-digit integer
	 * Repeats if invalid input entered
	 */
	
	public void askOrder() {
		
		System.out.println("It's time to write your answer.\n");
		keyEnter();
		
		String answer = "";
		boolean checker = false;
		int ans = 0;
		
		while(!checker) {
			
			do {
				System.out.println("Enter the Order: ");
				answer = myScanner.nextLine();
			}while(answer.isBlank());
			
			try {
				ans = Integer.parseInt(answer);
			}catch(NumberFormatException e) {
			}
			
			if(answer.length() == 10) {
				checker = true;
			}else {
				System.out.println("Invalid input");
			}
		}
		
		if(answer.equalsIgnoreCase("3704295618")) {
			win();
		}else {
			System.out.println();
		}
	}
	
	/**
	 * Method for winning the game
	 */
	
	public void win() {
		System.out.println("\nI hate to admit that you have saved your remaining classmates.");
		System.out.println("You won the game.");
		System.exit(0);
		/*
		 * completely stops the program
		 */
	}
	
	/*
	 * Method whatToDoLR are commands found in Living Room
	 */
	
	/**
	 * Method whatToDoLR are commands found in Living Room
	 * @param quantities for the quantities
	 * @param hasOpened if envelopes are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void whatToDoLR(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		System.out.println("What should you do?");
		System.out.println("[1] Try to answer the clue\n[2] Try to guess the order\n"
				+ "[3] Leave Living Room\n");
		
		int choice = choose(3);
		
		switch(choice){
		case 1: 
			answerClue(quantities, hasOpened, hasFound, hasAnswered);
			break;
		case 2:
			if(hasOpened[9] == false) {
				askOrder();
				or.toWait(quantities, hasOpened, hasFound, hasAnswered);
			}else {
				System.out.println("You can only submit your answer once every phase.");
				whatToDoLR(quantities, hasOpened, hasFound, hasAnswered);
			}
			break;
		case 3:
			whereToGo(quantities, hasOpened, hasFound, hasAnswered);
		}
	}
	
	/**
	 * Method answerClue manages the answering players to the clues
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void answerClue(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		
		System.out.println("The clue for which victim?");
		System.out.println("[1] 3rd     [5] 7th\n[2] 4th     [6] 8th\n"
				+ "[3] 5th     [7] 9th\n[4] 6th     [8] 10th");
		
		int choice = choose(8);
		
		check(quantities, choice, hasAnswered);
		
		whatToDoLR(quantities, hasOpened, hasFound, hasAnswered);

	}
	
	/**
	 * Method check checks the answer of the player if it is right or wrong
	 * @param quantities for the quantities
	 * @param choice chosen Number
	 * @param hasAnswered if the clues are answered
	 */
	
	public void check(int[] quantities, int choice, boolean[] hasAnswered) {
		
		int[] answers = new int[]{1727, 1827, 1884, 1889, 1895, 1907, 1920, 1945};
		int ans;
		
		if(hasAnswered[choice - 1] == false) {
			System.out.println("Type your answer: ");
			try {
				String answer = myScanner.nextLine();
				ans = Integer.parseInt(answer);
			}catch(NumberFormatException e) {
				System.out.println("Your answer is wrong.\n");
				quantities[0] = sanity.Wrong(quantities[0]);
				return;
			}
			
			if(ans == answers[choice - 1]) {
				System.out.println("You got the correct clue.\n");
				quantities[0] = sanity.Correct(quantities[0]);
				hasAnswered[choice - 1] = true;
			}else {
				System.out.println("Your answer is wrong.\n");
				quantities[0] = sanity.Wrong(quantities[0]);
				if(quantities[0] <= 0) {
					sanity.Crazy();
				}
				return;
			}
		}else {
			System.out.println("You have answered this clue already.\n");
		}
		
		
		
	}
}
