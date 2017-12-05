package lesson.ifstatement;

import java.util.Scanner;

public class Uppgift3 {
	public static void main (String[] args) {
		/*
		 * 3. Write a Java program to determine whether an input number is an even number.
		 * Represent it with code:
		 */
		

		Scanner usersScanner = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int number = usersScanner.nextInt();
	    
	    
	    
	    
	    if (number % 2 == 0) {
	    	System.out.println("Jämn");
	    	
	    } else {
	    	System.out.println("Udda");
	    }
		
		
	}

}
