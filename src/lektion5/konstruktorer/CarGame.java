package lektion5.konstruktorer;

/**
 * Main method for the car game
 * @author rasmus.lofvenhamn
 *
 */
public class CarGame {
/**
 * The main class used to run game
 * @param args
 */
	public static void main(String[] args) {
	    // Creats a object of a car som vi ger f�rgen green
		Car kimjongBil = new Car("green");	
       
	   // skriver ut och h�mtar bilens hastighet 
	   System.out.println(kimjongBil.getSpeed());
	   
	   // s�tter bilens hastighet
	   kimjongBil.setSpeed(2000); 
	  
       // skriver ut och h�mtar bilens hastighet igen	  
	   System.out.println(kimjongBil.getSpeed());
	
	
	}

}
