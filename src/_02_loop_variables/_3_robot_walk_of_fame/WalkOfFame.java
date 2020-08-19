
package _02_loop_variables._3_robot_walk_of_fame;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		int robx = 20;
		rob.setX(20);
		rob.setSpeed(40);
		rob.penDown();
		for (int x = 0; x < 5; x++) {
			rob.setAngle(144);
			for (int i = 0; i < 5; i++) {
				rob.setPenColor(Color.yellow);
				rob.move(30);
				rob.turn(144);
			}
			robx += 50;
			rob.setX(robx);
		}
		/** THE CHALLENGE: **/
	
	}
}
