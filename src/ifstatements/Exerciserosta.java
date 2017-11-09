package ifstatements;

import java.util.Scanner;

public class Exerciserosta {

	public static void main(String[] args) {
		
		Scanner usersScanner = new Scanner(System.in);
	    System.out.println("Ange ålder: ");
	    int number = usersScanner.nextInt();

	    // om man är äldre än 17 får man rösta
	    if (number > 17 ) {
	    	System.out.println("Du får rösta");
	 // annars får man inte rösta
	    } else {
	    	System.out.println("Du får inte rösta");
	    }
	}

}