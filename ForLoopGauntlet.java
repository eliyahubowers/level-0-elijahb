package level0;

public class ForLoopGauntlet {
	public static void main(String[] args) {
for (int a = 0; a < 101; a++) {//0-100
	System.out.println(a);
}				
for (int b = 100; b >= 0; b--) {//100-0
	System.out.println(b);
}
for (int c = 2; c <= 100;  c+=2) {//even 2-100
	System.out.println(c);
}
for (int d = 1; d <= 99;  d+=2) {//odd 1-99
	System.out.println(d);
}
for (int e = 1; e <= 500;  e+=2) {//even/odd 1-500
	System.out.println(e + " odd");
	System.out.println(e+1 + " even");
}
for (int f = 0; f <= 777;  f+=7) {//7 multiples 0-777
	System.out.println(f);
}
for (int g = 2005; g < 2017; g++) {
	System.out.println("In "+g+" I was " +(g-2005)+" years old");
}
for (int h = 0; h < 3; h++) {
	for (int i = 0; i < 3; i++) {
		System.out.println(h+" "+i);
	}
}
for (int j = 1; j < 4; j++) {//1 2 3
	System.out.print(j+" "); //4 5 6
}                            //7 8 9
System.out.println("");
for (int j = 4; j < 7; j++) {
	System.out.print(j+" "); 
}
System.out.println("");
for (int j = 7; j < 10; j++) {
	System.out.print(j+" "); 
}
System.out.println("");
for (int k = 0; k < 100; k+=10) {//1-100 in square of 10 by 10
	System.out.println("");
	for (int l = 1; l < 11; l++) {
		System.out.print(l+k +" ");
	}}
	for (int m = 5; m >=0; m--) {
		System.out.println();
		for (int n = m; n < 6; n++) {
			System.out.print("*");
		}
	}
}
	}

