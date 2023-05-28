package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Birthday {
	
	public static void main(String[] args) {
		
		String birthday = JOptionPane.showInputDialog(null, "What is your Birthday?");
		if(birthday.equals("5/28")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
			
		} else {
			JOptionPane.showMessageDialog(null, "It isn't your birthday...");
		}

	}
	
}
