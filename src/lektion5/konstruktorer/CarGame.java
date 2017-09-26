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
	    // Creats a object of a car som vi ger färgen green
		Car kimjongBil = new Car("green");	
       
	   // skriver ut och hämtar bilens hastighet 
	   System.out.println(kimjongBil.getSpeed());
	   
	   // sätter bilens hastighet
	   kimjongBil.setSpeed(2000); 
	  
       // skriver ut och hämtar bilens hastighet igen	  
	   System.out.println(kimjongBil.getSpeed());
	
	
	}

}
