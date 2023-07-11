package day04.solved;


/**
 * @author Vinit Gore
 *
 **/
class Animal1 {
	private int age;
	private String name;
	
	public Animal1(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}


/**
 * @author Vinit Gore
 *
 **/
public class LionWithSuper extends Animal1 {

	public LionWithSuper(String name) {
		super(name);		// Calling the constructor of Animal class
		System.out.println("Calling Child Constructor");
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old " + getName() + " says: Roar!");
	}

	public static void main(String[] args) {
		LionWithSuper simba = new LionWithSuper("Simba");
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}