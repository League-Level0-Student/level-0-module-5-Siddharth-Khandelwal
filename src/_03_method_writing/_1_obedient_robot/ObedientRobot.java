package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot nugget = new Robot();
	nugget.setSpeed(10);
	nugget.turn(-90);
	nugget.move(100);
	nugget.penDown();
	for (int i = 0; i < 4; i++) {
	nugget.move(275);
	nugget.turn(90);
	}
	}
}
