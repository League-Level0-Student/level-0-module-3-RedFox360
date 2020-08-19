package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class Years_alive {
@SuppressWarnings("unused")
public static void main(String[] args) {
	String years = JOptionPane.showInputDialog("How old are you?");
	int year = Integer.parseInt(years);
	for (int i = year; i > 0; i--) {
		
	
		System.out.println(2020-i);
		}
	System.out.println(2020);
}
}
