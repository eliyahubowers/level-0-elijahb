package level0;

import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		String grade = JOptionPane.showInputDialog(null, "put in a test score between 1 and 100");
		int g = Integer.parseInt(grade);
		if(g<=100 && g>=97){
			JOptionPane.showMessageDialog(null, "You got a A+");   	
		}
		if(g<97 && g>=93){
			JOptionPane.showMessageDialog(null, "You got a A");   	
		}
		if(g<93 && g>=90){
			JOptionPane.showMessageDialog(null, "You got a A-");   	
		}
		if(g<90 && g>=87){
			JOptionPane.showMessageDialog(null, "You got a B+");   	
		}
		if(g<87 && g>=83){
			JOptionPane.showMessageDialog(null, "You got a B");   	
		}
		if(g<80 && g>=77){
			JOptionPane.showMessageDialog(null, "You got a B-");   	
		}
		if(g<93 && g>=90){
			JOptionPane.showMessageDialog(null, "You got a C+");   	
		}
		if(g<77 && g>=73){
			JOptionPane.showMessageDialog(null, "You got a C");   	
		}
		if(g<73 && g>=70){
			JOptionPane.showMessageDialog(null, "You got a C-");   	
		}
		if(g<70 && g>=67){
			JOptionPane.showMessageDialog(null, "You got a D+");   	
		}
		if(g<67 && g>=63){
			JOptionPane.showMessageDialog(null, "You got a D");   	
		}
		if(g<63 && g>=60){
			JOptionPane.showMessageDialog(null, "You got a D-");   	
		}
		if(g<60 && g>=0){
			JOptionPane.showMessageDialog(null, "You got a F");   	
		}
}
}