package level0;


	// Copyright The League of Amazing Programmers 2014
	import javax.swing.JOptionPane;
	 
	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. Then
	 * make me a sandwich.
	 */
	public class ChangeCalculator {
	 
		public static void main(String[] args) {
	 String pennies = JOptionPane.showInputDialog("How many pennies do you have?");
	 int p = Integer.parseInt(pennies);
			
	String nickels = JOptionPane.showInputDialog("How many nickles do you have?");
	int n = Integer.parseInt(nickels);		
	 
	 String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	 int d = Integer.parseInt(dimes);
			
	 String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
	 int q = Integer.parseInt(quarters);
	 
double money = q*.25 + n*.05 + d*.10 + p*.01 ; 
		
System.out.println("you have $" + money);
	 JOptionPane.showMessageDialog(null, "You have " + money);
		}
	}
	 


