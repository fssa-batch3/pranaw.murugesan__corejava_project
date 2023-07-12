package day05.practice;

class Department {
	String deptName;
	int deptId;
	
}

class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign depart and respective attributes
	
	Student(String name,int id){
		this.name = name;
		this.id = id;
		
	}
	
	// Add toString method to get the Student details. 
	@Override
    public String toString() {
        return "Student [name =" + name + ", id =" + id + "]";
    }
}
public class Main{
	
}
// Create a main class to create a Student and Department objects 
// and print the details