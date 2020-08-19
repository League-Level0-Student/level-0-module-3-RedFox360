
package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot("batman");

	public static void main(String[] args) {

		// 1. Use the dance method below to make the robot spin.
		robot.setSpeed(30);

		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number
		// of times.
		String[] options = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", };
		int colorop = JOptionPane.showOptionDialog(null,
				"How Dizzy do you want your robot to get, on a scale of 1 to 10",
				"How Dizzy do you want your robot to get?", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.INFORMATION_MESSAGE, null, options, null);
		dance(colorop + 1);
	}

	/***************** Use this method, DON'T CHANGE THE CODE BELOW **************/

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}}}
