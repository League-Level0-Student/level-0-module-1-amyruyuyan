package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("what 8 letter word can have a letter taken away and still make a word. take another letter away and it still makes a word. keep doing that until you have one letter left. What is the word? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("starting")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
	score = score + 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "the correct answer is starting");
}
		// 6. Add some more riddles
String two = JOptionPane.showInputDialog("What comes once in a minute, twice in a moment, but never in a thousand years?");
if(two.equals("the letter m")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
	score = score + 1;
}
	else {
		JOptionPane.showMessageDialog(null, "the correct answer is the letter m");	
	}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is " + score);
	}
}

