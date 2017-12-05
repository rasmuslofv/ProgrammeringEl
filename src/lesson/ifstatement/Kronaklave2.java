package lesson.ifstatement;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Kronaklave2 {
	
	private static int wins = 0;
	private static int loss = 0;
	
	public static void main(String[] args) {
		
		String nmbGamesText = JOptionPane.showInputDialog(null, "How many games?", "Games?", -1);
		   
		int nmbGames = Integer.parseInt(nmbGamesText);
		
		for (int i = 0; i < nmbGames; i++) {
			printBoard();
		}	
	}
     
	private static void printBoard()  {
	   //String userPick = JOptionPane.showInputDialog( "Please choose Heads or Tails: ");
	   //String userPick = JOptionPane.showInputDialog(null, "Choose heads or tails", "Welcome", -1);
	   
	   String[] options = new String[] { "Krona", "Klave" };
	   int userPick = JOptionPane.showOptionDialog(null, "Choose heads or tails", "Welcome", 
			   JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
			   options[0]);
	   
	   
	   
	   
	   Random randomGenerator = new Random();
       int coinFlipValue = randomGenerator.nextInt(2);
    
       if (userPick == coinFlipValue) {
    	   wins++;
    	   JOptionPane.showMessageDialog(null, "You won:\nWins: " + wins + "\nLoss: " + loss, "Res", -1, null);
       } else {
    	   loss++; 
    	   JOptionPane.showMessageDialog(null, "You loss:\nWins: " + wins + "\nLoss: " + loss, "Res", -1, null);
       }
	}             
}