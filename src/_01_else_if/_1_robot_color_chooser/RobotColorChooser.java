
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
int cor = 0;
		// 1. Create a new Robot

		Robot r = new Robot("batman");

		// 2. Make the robot draw a shape (this will take more than one line of code)
		
		// 3. Set the pen width to 10
		r.setPenWidth(10);
		// 4. Ask the user what color pen they would like the robot to draw with

		        String[] options = {"Red", "Green", "Blue", "Random"};
		        int colorop = JOptionPane.showOptionDialog(null, "Choose a color",
		                "Choose a color",
		                JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		        if(colorop==0)	{
		        	r.setPenColor(Color.red);
		        }
		        if(colorop==1)	{
		        	r.setPenColor(Color.green);
		        }
		        if(colorop==2) {
		        	r.setPenColor(Color.blue);
		        }
		        if(colorop==3)	{
		        	r.setRandomPenColor();
		        }
		        String[] options2 = {"Triangle", "Square", "Pentagon", "Octagon"};
		        int colorop2 = JOptionPane.showOptionDialog(null, "Choose a shape",
		                "Choose a shape",
		                JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options2, null);
		        if(colorop2==0)	{
		        cor = 3;
		        }
		        if(colorop2==1)	{
		        cor = 4;
		        }
		        if(colorop2==2) {
		       cor = 5;
		        }
		        if(colorop2==3)	{
		        cor = 8;
		        }
		    
		        r.setSpeed(50);
				r.penDown();
				for (int i = 0; i < cor; i++) {
					r.move(100);
					r.turn(360 / cor);
				}
	}
}
					
				
		        
		
				
			
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	

	

