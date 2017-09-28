package exercises.classes; 

public class Person {

	private String name;

	public Person() {
		System.out.println("constructor running");
	}

	public Person(String name) {
		System.out.println("constructor 2 running");
		System.out.println(name);
		this.name = name;
	}

	public void writeName() {
		System.out.println("My name is " + name);
	}

	public String getName() {
		
		return null;
	}

	public void setName(String name2) {
		
		
	}
}