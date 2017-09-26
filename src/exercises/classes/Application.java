package exercises.classes;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// Vi har skapat ett objekt av klassen Person
		Person sturePerson = new Person("MEMES");
		sturePerson.writeName();
	    
		sturePerson.setName("Sture");
	    sturePerson.writeName();
	}

}
