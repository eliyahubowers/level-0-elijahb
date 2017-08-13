package level0;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's
		// how to do it...
		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog("Enter a adjective");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter a liquid");
		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		String message = "Piranhas are more " + adjective + " during the day, so cross the river at "
				+ "night.\nPiranhas are attracted to fresh " + liquid + " and will most "
				+ "likely take a bite out\nof your " + bodyPart + " if you " + verb + " . Whatever "
				+ "you do, if you have an open wound,\ntry to find another way to get " + "back to the " + place
				+ " . Good luck!";
		JOptionPane.showMessageDialog(null, message);
		// Make a pop-up for the final story. You can use \n to go to the next
		// line.

	}
}
