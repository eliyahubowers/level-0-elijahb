package level0;

import javax.swing.JOptionPane;

public class rollerCoaster {
public static void main(String[] args) {
String want = JOptionPane.showInputDialog("Do you want to go on the silver bullet?");	
if(want == "yes"){
String inches = JOptionPane.showInputDialog("How tall are you to the nearest inch?");	
int tall = Integer.parseInt(inches);
if(tall>50){
	JOptionPane.showMessageDialog(null, "you are allowed to go on the ride.");
}
else if(tall==50){
	JOptionPane.showMessageDialog(null, "you are just tall enough to go on the ride!");
}
else if(tall<50 && tall>40){
	JOptionPane.showMessageDialog(null, "you you have to ask your parents to ride with you.");
}
else if(tall<40){
	JOptionPane.showMessageDialog(null, "maybe next year.");
}
}
}
}
		

