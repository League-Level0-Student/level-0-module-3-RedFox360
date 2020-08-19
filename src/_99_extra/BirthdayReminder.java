
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 3rd";
		String dadsBirthday = "May 15th";
		String myBirthday = "January 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String whoseBirthday = JOptionPane.showInputDialog("I don't know what to say in this text field");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
				if(whoseBirthday.equalsIgnoreCase("mom"))	{
					JOptionPane.showMessageDialog(null, momsBirthday);
				}
			//print mom's birthday
		// 5. if user asked for "dad"
		if(whoseBirthday.equalsIgnoreCase("dad"))	{
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		if(whoseBirthday.equalsIgnoreCase("sameer"))	{
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else	{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
		}

	} 
}
