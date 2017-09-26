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
	 * Konstruktor f�r Bil classen S�tter f�rgen p� bilen vid skapande.
	 */
	public Car(String selectedColor) {
		color = selectedColor;
	}

	/**
	 * �ndrar hastigheyen p� bilen. newSpeed- int - den nya hastigheten som car
	 * objektet ska f�
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