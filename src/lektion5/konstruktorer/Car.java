package lektion5.konstruktorer;


/**
 * Car class for learning 
 * @author rasmus.lofvenhamn
 *
 */
public class Car {
	private int numberOfDoors = 5;
	private int numberOfWheels = 4;
	private String color = "blue";
	private int antaletRattar = 1;
	private String carBrand = "Volvo";
	private int speed = 0;

	/**
	 * Konstruktor för Bil classen Sätter färgen på bilen vid skapande.
	 */
	public Car(String selectedColor) {
		color = selectedColor;
	}

	/**
	 * Ändrar hastigheyen på bilen. newSpeed- int - den nya hastigheten som car
	 * objektet ska få
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	/**
	 * Returns the value of the speed variable 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * sets the color value
	 * @param newColor - Requires a string
	 */
	public void setColor(String newColor) {
		color = newColor;
	}

	/**
	 * Returns the color value 
	 * @return
	 */
	public String getColor() {
		return color;
	}
}