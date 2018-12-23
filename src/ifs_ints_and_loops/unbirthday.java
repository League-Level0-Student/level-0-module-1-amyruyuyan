package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String birthday ;
	birthday = JOptionPane.showInputDialog("when is your birthday");
	if(birthday.equals("12/23"))
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	else
		JOptionPane.showMessageDialog(null, "Happy UNBirthday");
}
}
