package ifstatements;

import java.util.Scanner;

public class Exerciserosta {

	public static void main(String[] args) {
		
		Scanner usersScanner = new Scanner(System.in);
	    System.out.println("Ange �lder: ");
	    int number = usersScanner.nextInt();

	    // om man �r �ldre en 17 f�r man r�sta
	    if (number > 17 ) {
	    	System.out.println("Du f�r r�sta");
	 // annars f�r man inte r�sta
	    } else {
	    	System.out.println("Du f�r inte r�sta");
	    }
	}

}