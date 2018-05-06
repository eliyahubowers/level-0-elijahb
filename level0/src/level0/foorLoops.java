package level0;

public class foorLoops {
 
	public static void main(String[] args) {
		
		for(int i = 0; i <= 2; i++) {		
			for(int e = 0; e <= 2; e++) {
			System.out.println(i + "" + e);					
			}			
		}
		
System.out.println(" ");
		
		for(int i = 1; i <= 9; i+=0) {
			for(int e = 0; e <= 2; e++) {
			System.out.print(i + " ");		
			i++;
			}
			System.out.println("");
		}
		
System.out.println(" ");
		
		for(int i = 1; i <= 100; i+=0) {
			for(int e = 0; e <= 9; e++){
			System.out.print(i + " ");			
			i++;	
			}	
			System.out.println(" ");
		}
		
System.out.println(" ");
		
		for(int i = 0; i <= 6; i++) {
			for(int e = 1; e <= i; e++) {
			System.out.print("*");	
			}	
			System.out.println(" ");
		}	
		
	}
}
