package level0;

import java.util.Random;

public class RandomCompliment {

	public static void main(String[] args) {
	Random ra = new Random();
	int r = ra.nextInt(6)+5;
	findCompliment(r);
				
	}

    static void findCompliment(int randomNumber) {
	if(randomNumber==5) {
	    System.out.println("your hair looks nice");	
	    }
	
	if(randomNumber==6) {
		System.out.println("hello");	
		}
	
	if(randomNumber==7) {
		System.out.println(":-)");	
		}
	
	if(randomNumber==8) {
		System.out.println(";-{");	
		}
	
	if(randomNumber==9) {
		System.out.println(";]");	
		}
	
	if(randomNumber==10) {
		System.out.println("!)");	
		}
    }
}    
