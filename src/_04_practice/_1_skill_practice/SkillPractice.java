package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have


 String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int Dimes = Integer.parseInt(dimes);
 int cents = 0;
cents = Dimes * 10;
		// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have "+cents+" cents.");



		// Ask the user how tall they are (inches)
 String inches = JOptionPane.showInputDialog("How tall are you (inches)?");
int Inches = Integer.parseInt(inches);
if(Inches<36) {
	JOptionPane.showMessageDialog(null, "Eat your wheaties!");
}
else{
JOptionPane.showMessageDialog(null, "Good, "+Inches+" inches is tall!");	
}
		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
for (int i = 1; i < 100; i++) {
	if (i%3==0) {
		System.out.println(i);
	}
}






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console
int number = 0;
			int Number = 0;
Random ran = new Random();
Number = ran.nextInt(11);
		number = ran.nextInt(21);
		System.out.print(number);
		System.out.print("-"+Number+"=");
		int answer = number-Number;
		System.out.println(answer);
// Get another random number that is less than 10 and print it to the console



		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction



		}

		void skill4() { // In a pop-up, ask the user for the city they live in
String City = JOptionPane.showInputDialog("What city do you live in?");
if(City.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego.");
}
		// If they answered "San Diego", tell them they live in America's Finest City



		// Otherwise, tell them to move to San Diego



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int Cars = 2;
if (Cars == 0){
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}

		// If there is 1 car, use a pop-up to display the make/model of the car
if(Cars == 1) {
JOptionPane.showMessageDialog(null, "Audi Q7");	
}

int tires = Cars*4;
		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
if(Cars > 1) {
	JOptionPane.showMessageDialog(null, "There are "+tires+" tires among your cars!");
}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school
String School = JOptionPane.showInputDialog("What is the name of your school?");


		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
		JOptionPane.showMessageDialog(null, School+" is a fantastic school!");
		}
}
