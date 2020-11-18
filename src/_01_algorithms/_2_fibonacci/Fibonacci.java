package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
	long numberOne = 0;
	long numberTwo = 1;
JOptionPane.showMessageDialog(null,"0");
JOptionPane.showMessageDialog(null, "1");
	for(int i = 0; i < 10; i++  ) {

	 long sum = numberOne + numberTwo;
JOptionPane.showMessageDialog(null, sum);
numberOne = numberTwo;
numberTwo = sum;
	}

}
}
