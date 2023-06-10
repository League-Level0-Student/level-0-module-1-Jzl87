package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	
	public static void main(String[] args) {
		
		// 1. Make a variable to hold the score
		int score = 0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("Who has a neck, yet no head?");
			if (riddle.equals("A bottle")) {
				JOptionPane.showMessageDialog(null, "Congratulations!");
				score += 1;
			} else {
			JOptionPane.showMessageDialog(null, "WRONG!");
			}
			
			String riddle2 = JOptionPane.showInputDialog("What has hand butt cannot clap?");
			if (riddle2.equals("A clock")) {
				JOptionPane.showMessageDialog(null, "Congratulations!");
				score += 1;
			} else {
			JOptionPane.showMessageDialog(null, "WRONG!");
			}
		// 6. Add some more riddles
			
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "This is your score: " + score);
	}
}

