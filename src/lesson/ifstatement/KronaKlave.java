package lesson.ifstatement;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class KronaKlave {

	
	public static void main(String[] args) {
		
      
	// Users scanner input
        Scanner usersGuess = new Scanner(System.in);
        System.out.println("Select Rick or Morten:");
        String usersPick = usersGuess.nextLine().toLowerCase();
 
        int wins = 0;
        int loses = 0;
         
        // System.out.println(usersPick);
	 
        
        // Computers random selector. 

		
        Random randomGenerator = new Random();
        boolean coinFlipValue = randomGenerator.nextBoolean();
        
		// System.out.println(coinFlipValue);
		
	    if (coinFlipValue == true) {
	       System.out.println("Rick");
	    }  else {
	    	System.out.println("Morten");
	    }	
	
	    if (coinFlipValue == true && usersPick.equals("rick") || coinFlipValue == false && usersPick.equals("morten")) {
	     
	    
	    }
	    System.out.println("wins " + wins + " : loses " + loses);
   }

 }	
	

	