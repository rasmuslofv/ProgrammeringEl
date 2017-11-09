package stensaxpase;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	// Users scanner input
     
    Scanner usersGuess = new Scanner(System.in);
    System.out.println("välj mellan Sten, Sax, Påse!");
    String usersPick = usersGuess.nextLine().toLowerCase();

    // System.out.println(usersPick);

    
    // Computers random selector. 
    Random randomGenerator = new Random();
    int StenSaxPåseValue = randomGenerator.nextInt(3);

    if (StenSaxPåseValue == 2) {
	   	System.out.println("Sten");}
	
	    if (StenSaxPåseValue == 0) {
	 System.out.println("Sax"); }
    
	 if (StenSaxPåseValue == 1) {
	System.out.println("Påse");
	
	 }
	
    
    
    if (StenSaxPåseValue == 0 && usersPick.equals("sten") ||StenSaxPåseValue == 1 && usersPick.equals("sax")|| StenSaxPåseValue == 2 && usersPick.equals("påse")) {
        System.out.println("You won!");
   
    } else { 
    	System.out.println("You lost!");
    }
	
	}

}