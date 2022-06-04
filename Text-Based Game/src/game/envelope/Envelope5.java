package game.envelope;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Envelope5 manages the fifth envelope
 * @author Leonel Fedric B. Tuburan
 *
 */

public class Envelope5 extends Envelope{
	
	/**
	 * Inherits the method in parent class Envelope
	 * Opens and reads msg5
	 * @param quantities for the quantities
	 * @param hasOpened if letters are opened
	 * @param hasFound if bodies are found
	 * @param hasAnswered if clues are answered
	 */
	
	public void openEnvelope(int[] quantities, boolean[] hasOpened, boolean[] hasFound, boolean[] hasAnswered) {
		try {
			InputStream is = getClass().getResourceAsStream("/letters/msg5.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println("No letter found.\n");
		}

		if(hasOpened[4] == false) {
			hasOpened[4] = true;
			hasOpened[9] = false;
			ps5.tellStory(quantities, hasOpened, hasFound, hasAnswered);
		}
	}
}
