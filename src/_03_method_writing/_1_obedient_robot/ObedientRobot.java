package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static	Robot nugget = new Robot();
public static void main(String[] args) {
	String Shape = JOptionPane.showInputDialog("What shape do you want? (Square or Triangle)");
	String Color = JOptionPane.showInputDialog("What colored shape do you want? (Black, Blue or Red )" );
	if(Color.equalsIgnoreCase("Blue")) {
		nugget.setPenColor(java.awt.Color.BLUE);
	}
	if(Color.equalsIgnoreCase("Red")) {
		nugget.setPenColor(java.awt.Color.RED);
	}
	if(Shape.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	else {
		drawSquare();
	}
	
}
static void drawSquare() {
nugget.penDown();
	nugget.setSpeed(10);
	for (int i = 0; i < 4; i++) {
	nugget.move(275);
	nugget.turn(90);
	}	
}
static void drawTriangle() {
	nugget.setSpeed(10);
	nugget.move(250);
	nugget.turn(180);
	nugget.penDown();
	for (int i = 0; i < 3; i++) {
	nugget.move(500);
	nugget.turn(120);
	}
}

}
