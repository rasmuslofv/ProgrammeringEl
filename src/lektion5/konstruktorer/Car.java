package lektion5.konstruktorer;

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
	 *
	 */

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	
	/**
	 * S�tter hastighet p� bilen. 
	 */

	}

	public int getSpeed() {
		return speed;
	}
	/**
	 * 
	 */

	
	public void setColor(String newColor) {
		color = newColor;
	}

	public String getColor() {
		return color;
	}
}