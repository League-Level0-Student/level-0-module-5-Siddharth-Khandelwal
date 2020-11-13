package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Type in a number.");
	int Number=Integer.parseInt(number);
	for (int i = 2; i < Number; i++) {
		if(Number%i==0) {
	JOptionPane.showMessageDialog(null, "Your number is not prime.");
	System.exit(0);	
	
	}

	}
	JOptionPane.showMessageDialog(null, "Your number was prime."); 
	}
}

