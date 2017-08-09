package level0;

import javax.swing.JOptionPane;

public class SecretMessageBox {
	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String i = "INTRUDER!!!!!!!!! ";
		// 1. Set the passcode in a String variable
		String Passcode = "~1@3$5^7*9)-+";
		// 2. Using a pop-up, ask for a secret message and store it in a variable
        String Secret = JOptionPane.showInputDialog(null, "tell me the secret message for safekeeping");
		// 3. Ask your friend for the passcode and store it in a variable
        String supposed = JOptionPane.showInputDialog(null, "to have access to the secret message you must put in the passcode");
		// 4. If the passcode matches, show the secret message
        if(supposed == Passcode){
        JOptionPane.showMessageDialog(null, Secret);
        }	
		// 5. If the passcode does not match, pop-up "INTRUDER!!"
        else{
        	JOptionPane.showMessageDialog(null, i + i + i + i + i + i + i);	
        }
		// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

}
}