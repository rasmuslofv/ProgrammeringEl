package exercises.classes;

public class Application {

	public static void main(String[] args) {

		System.out.println("Hello World");

		Person person = new Person("Sture"); 
		
		String name = person.getName();
		name = name + "Sture";
		person.setName(name);
		person.writeName();
	}
}
