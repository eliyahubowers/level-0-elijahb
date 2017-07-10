package level0;

public class Nintey9 {
public static void main(String[] args) {
for (int i = 99; i > 0; i--) {
if(i>2){
	System.out.println(i+" bottles of beer on the wall "
	
		+ i+" bottles of beer "
		
		+ " take one down pass it around, "
        
	+ (i-1) +" bottles of beer on the wall, ");
}
else if(i==2){
	System.out.println(i+" bottles of beer on the wall "
			
		+ i+" bottles of beer "
		
		+ " take one down pass it around, "
        
	+ (i-1) +" bottle of beer on the wall, ");
}	

else if(i==1){
	System.out.println(i +" bottle of beer on the wall "
	
		+ i+" bottle of beer "
		
		+ " take one down pass it around, "
        
	+"No more bottles of beer on the wall");
	
}}}}


