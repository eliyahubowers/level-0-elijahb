package level0;

import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
	String number1 = JOptionPane.showInputDialog(null, "put in a number");
	String number2 = JOptionPane.showInputDialog(null, "put in a number");
	String number3 = JOptionPane.showInputDialog(null, "put in a number");
	int a = Integer.parseInt(number1);
	int b = Integer.parseInt(number2);
	int c = Integer.parseInt(number3);
	if(a<b && a<c){
	    System.out.print(a+", " );
     	}
 	else if(b<a && b<c) {
	    System.out.print(b+", " );		
      	}
	else if(c<a && c<b) {
		System.out.print(c+", " );		
		}
    if(a>b && a<c) {
    	    System.out.print(a+", "+c);		
        }
    else if(a<b && a>c) {
    	System.out.print(a+", "+b);	
    }
    else if(b>a && b<c) {
	    System.out.print(b+", "+c);		
    }
    else if(b<a && b>c) {
	System.out.print(b+", "+a);	
    }
    else if(c>a && c<b) {
	    System.out.print(c+", "+b);		
    }
    else if(c<a && c>b) {
	System.out.print(c+", "+b);	
    }

    
	}	
 }
