package _02_nested_loops._3_for_loop_gauntlet;



public class Loops {
public static void main(String[] args) {
	
for (int i = 0; i < 101; i++) {
System.out.println(i); 	
}
for (int j = 100; j >= 0; j--) {
	System.out.println(j);
	
}
for (int k = 2; k <= 100; k++) {
	
	if(k%2==0) {
			System.out.println(k);
	}
}
for (int s = 0; s <= 99; s++) {

	if(s%2==0) {
		
	}
	else {
	System.out.println(s);	
	}
}


for (int h = 0; h <= 500; h++) {
	if (h%2==0) {
		System.out.println(h+" is even");
	}
	else {
		System.out.println(h+" is odd");
	}
}
for (int e = 0; e <= 777; e++) {
	if(e%7==0) {
	System.out.println(e);	
	}
}
	
}










}
