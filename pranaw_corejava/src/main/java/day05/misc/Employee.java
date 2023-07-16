package day05.misc;

public class Employee{
	String name;
	int id ;
	Employee Manager;
	
	public static void main(String[] args) {
		
		Employee manager2 = new Employee();
		manager2.id=3;
		manager2.name="shyam";
		
		
		Employee manager = new Employee();
		manager.id = 2;
		manager.name="prasanna";
		manager.Manager = manager2;
		
		Employee pranaw = new Employee();
		pranaw.id=1;
		pranaw.name = "pranaw Murugesan";
		pranaw.Manager = manager;
	}
}