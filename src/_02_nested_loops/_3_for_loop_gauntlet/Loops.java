package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class Loops {
public static void main(String[] args) {
	
//for (int i = 0; i < 101; i++) {
//System.out.println(i); 	
//}
//for (int j = 100; j >= 0; j--) {
//	System.out.println(j);
//	
//}
//for (int k = 2; k <= 100; k++) {
//	
//	if(k%2==0) {
//			System.out.println(k);
//	}
//}
//for (int s = 0; s <= 99; s++) {
//
//	if(s%2==0) {
//		
//	}
//	else {
//	System.out.println(s);	
//	}
//}
//
//
//for (int h = 0; h <= 500; h++) {
//	if (h%2==0) {
//		System.out.println(h+" is even");
//	}
//	else {
//		System.out.println(h+" is odd");
//	}
//}
//for (int e = 0; e <= 777; e++) {
//	if(e%7==0) {
//	System.out.println(e);	
//	}
//}
//int j = 0;
//	for (int i = 2010; i <= 2019; i++) {
//		System.out.println( "In "+i+" I was "+j+" years old.");
//			j++;
//			
//		}
//	System.out.println("In 2020 I am 10 years old.");
//
//
//
//for (int i = 0; i < 3; i++) {
//	for (int j = 0; j < 3; j++) {
//		
//	
//	System.out.println( i+""+j );
//	}
//
//}
int x = 1;
for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
		System.out.print(x);
		x = x + 1;
	}
	System.out.println();
}


int b = 1;
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		System.out.print(b + "\t");
		b = b + 1;
	}
	System.out.println();
}








}

}

