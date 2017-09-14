package lektion5.konstruktorer;

public class CarGame {

	public static void main(String[] args) {
	    Car kimjongBil = new Car("green");	
        
	   System.out.println(kimjongBil.getSpeed());
	    
	   kimjongBil.setSpeed(2000); 
	   System.out.println(kimjongBil.getSpeed());
	
	
	}

}
