package Rectangle;

public class Employee {
    private int id;
    private String lastName;  
    private String firstName; 
    private int salary;
    
    public Employee (int id, String firstName, String lastName, int salary) {
    	this.id = id; 
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.salary = salary; 
    	
    }
    
    
    public int getID() {
		return id;
    }
    public String getfirstName() {
		return firstName;
    	
    }
    public String getlastName() {
		return lastName;
 }
    public String getName() {
		return getName();	
    }
    public int getSalary() {
		return salary;
    	
    }
    public void setSalary(int salary) {
    	this.salary = salary;
    }
    public int getAnnualSalary() {
		return  salary * 12;
    }
    public int raiseSalary(int percent) {
    	this.salary = this.salary * percent;
    	return this.salary;
    }
    public String toString() {
    	return "Employee[id= " + this.id + ", name="+ firstName + " " + lastName + ", salary=" + salary + "]";	
    }
}  
