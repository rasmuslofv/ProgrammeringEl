package yatzy;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printBoard();
	}

	private static void printBoard() {
		
		int wins = 0;
	    int loss = 0;
		int draw = 0;
		
		int nmbGames = 2;
		
		int Games = nmbGames;
		
		for (int i = 0; i < Games; i++)
		
		JOptionPane.showMessageDialog(null, "on god", "B", -1);
		String name = JOptionPane.showInputDialog("Enter your motu patlu name here:");
		JOptionPane.showInputDialog(null, "Dice", "Dice", -1, icon, null, null);
		JOptionPane.showMessageDialog(null, "So your name is " + name);
	}
	
}
