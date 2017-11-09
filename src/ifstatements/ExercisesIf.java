package ifstatements;

import java.util.Scanner;

public class ExercisesIf {

	public static void main(String[] args) {
		

	    Scanner usersScanner = new Scanner(System.in);
	    System.out.println("Select a number: ");
	    int number = usersScanner.nextInt();
	    if (number > 8 && number < 10 || number > 33) {
	    	System.out.println("Good");
	    } else {
	    	System.out.println("Bad");
	    }
	}

}
