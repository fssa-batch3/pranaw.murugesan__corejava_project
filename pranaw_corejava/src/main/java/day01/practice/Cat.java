package day01.practice;


public class Cat{
	private int age;
	private String color;

	// Constructor
	public Cat(int age, String color) {
		this.age = age;
		this.color = color;
	}

	// Getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String speak() {
		return "Meow!";
	}
	public static void main(String[] args) {
//		instantiating objects
		Cat cat1 = new Cat(4,"White");
		Cat cat2 = new Cat(3,"Black");
//		printing cat 1
		System.out.println("Cat 1:");
		System.out.println("Age: "+ cat1.age);
		System.out.println("Color: "+ cat1.color);
		System.out.println("Speaks: "+cat1.speak());
//		printing cat 2
		System.out.println("Cat 2:");
		System.out.println("Age: "+ cat2.age);
		System.out.println("Color: "+ cat2.color);
		System.out.println("Speaks: "+cat2.speak());
		
		
	}
}