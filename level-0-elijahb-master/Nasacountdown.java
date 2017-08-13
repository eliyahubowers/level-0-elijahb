package level0;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

public class Nasacountdown {
	public static void main(String[] args) {
		
			
		
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String count = JOptionPane.showInputDialog("where do I start the countdown");
		for (int i = 0; i < 1000000000; i++) {
			// 3. convert the user's answer to an int (Integer.parseInt)
	 int c = Integer.parseInt (count); 
		// 4. countdown from user's starting point
		
		// 1. countdown from 10 to 0
        for(; c>-1;c=c-1 ){
        	speak(Integer.toString(c));
        }
		// 5  when the counting is done, print "blastoff!"
		speak("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbblllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaassssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooofffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
	}
}
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }	
}
