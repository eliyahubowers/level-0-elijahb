package level0;
	 import java.util.Random;

import javax.swing.JOptionPane;

	// Copyright Wintriss Technical Schools 2013
	public class HighLow {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			
			int random = new Random().nextInt(100);
			int n = 0;
			// 2. Print out the random variable above
			System.out.println(random);
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++) {
				// 1. ask the user for a guess using a pop-up window, and save their response 
               String number = JOptionPane.showInputDialog(null, "Pick a random number");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
               n = Integer.parseInt(number);
				// 5. if the guess is correct
               if(n == random){
					// 6. win
            	   JOptionPane.showMessageDialog(null, "You win!");
            	   i=10;
               }
				// 7. if the guess is high
               if(n > random){
					// 8. tell them it's too high
            	   JOptionPane.showMessageDialog(null, "Your guess was too high");
               }
				// 9. if the guess is low
               if(n < random){
					// 10. tell them it's too low
            	   JOptionPane.showMessageDialog(null, "Your guess was too low");
               }
			}
			// 12. tell them they lose
             if(n!=random){
            	 JOptionPane.showMessageDialog(null, "YOU LOSE");
             }
             }
		}
	


