package Rectangle;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {

	}
	/**
	 * Konstruktor 
	 * @param length 
	 * @param width
	 */
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	/**
	 * Returnerar l�ngden p� rectangeln
	 * @return
	 */
	public float getLength() {
		return length;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;

	}

	public double getPerimeter() {
		return 2*(width + length);

	}
}
