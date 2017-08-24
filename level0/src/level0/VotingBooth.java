package level0;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	int e = 0;
	int m = 0;
for (int i = 0; i < 10; i++) {
String vote = JOptionPane.showInputDialog(null, "do you want Elsa or Mowana to be the Queen of earth?");	
	if(vote.equals("Elsa")) {
	e++;
	}
	else if (vote.equals("Mowana")) {
	m++;	
	}
}	
if(m>e) {
JOptionPane.	showMessageDialog(null, "Mowana is the new Queen of earth");
}
else if(m==e) {
JOptionPane.	showMessageDialog(null, "It was a tie");
}
else{
JOptionPane.	showMessageDialog(null, "Elsa is the new Queen of earth");
}
}
}
