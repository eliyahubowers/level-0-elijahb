package level0;

import java.util.Random;

import javax.swing.JOptionPane;

public class Triangle {

	public static void main(String[] args) {
			
	String charcter = JOptionPane.showInputDialog(null, "give me a charecter");		
	Random randy = new Random();
	int r = randy.nextInt(16)+5;
	
	sidewaysTrianglePrinter(charcter , r);
	uprightTrianglePrinter(charcter, r);
	}
	
	static void sidewaysTrianglePrinter(String charecter, int r){
		for(int i = 0; i <= r; i++) {
			for(int e = 1; e <= i; e++) {
			System.out.print(charecter + " ");	
			}	
			System.out.println(" ");
		}
		
		for(int i = r-1; i >= 0; i--) {
			for(int e = 1; e <= i; e++) {
			System.out.print(charecter + " ");	
			}	
			System.out.println(" ");
		}
		
	}
	
	static void uprightTrianglePrinter(String charecter, int r){
		for(int i = 0; i <= r; i++) {
			for(int j = r; j >= i; j--){
			    System.out.print(" ");
				}
			   for(int e = 1; e <= i; e++) {
			   System.out.print(charecter + " ");	
			   }	
			   System.out.println(" ");
		}		
	}
}
