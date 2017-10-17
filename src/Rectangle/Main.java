package Rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(3.0f, 4.0f);
    
		System.out.println( rectangle1.getLength() );
               
		rectangle1.setLength(75.45f); 
     
      System.out.println( rectangle1.getLength() );
	
	  System.out.println( rectangle1.getArea() );
	  
	  System.out.println(rectangle1.toString() );
	  
	  
	  Employee employee1 = new Employee(15, "Pickle", "Rick", 3000);
	  
	  System.out.println( employee1.getSalary() );
	  System.out.println( employee1.getAnnualSalary());
      System.out.println( employee1.raiseSalary(20));
	  System.out.println( employee1.toString() );
	
	}
}	