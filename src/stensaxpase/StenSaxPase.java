package stensaxpase;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	// Users scanner input
     
    Scanner usersGuess = new Scanner(System.in);
    System.out.println("v�lj mellan Sten, Sax, P�se!");
    String usersPick = usersGuess.nextLine().toLowerCase();

    // System.out.println(usersPick);

    
    // Computers random selector. 
    Random randomGenerator = new Random();
    int StenSaxP�seValue = randomGenerator.nextInt(3);

    if (StenSaxP�seValue == 2) {
	   	System.out.println("Sten");}
	
	    if (StenSaxP�seValue == 0) {
	 System.out.println("Sax"); }
    
	 if (StenSaxP�seValue == 1) {
	System.out.println("P�se");
	
	 }
	
    
    
    if (StenSaxP�seValue == 0 && usersPick.equals("sten") ||StenSaxP�seValue == 1 && usersPick.equals("sax")|| StenSaxP�seValue == 2 && usersPick.equals("p�se")) {
        System.out.println("You won!");
   
    } else { 
    	System.out.println("You lost!");
    }
	
	}

}