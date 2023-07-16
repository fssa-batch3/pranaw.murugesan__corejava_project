package day04.misc;

public class Practice {
	public static void main(String[] args) {
		Bowser bowser = new Bowser();
		bowser.printName();
		
	}
}

abstract class Enemy {
//	if a class is abstract, its method should always abstract
	
	public String name = "enemy";

	public abstract void jump(); 

	public abstract void run();

	public abstract void killMario();
	
	//public abstract void working(){
//		abstract method should not have body
	//}

}


class Bowser extends Enemy{ // if a class extends abstract class, it should write abstract methods

	// add unimplemented methods
	public String name = "Boswer";
	
	@Override
	public void jump() {
		System.out.println("jumping");
		
	}

	@Override
	public void run() {
		System.out.println("running");
		
	}

	@Override
	public void killMario() {
		System.out.println("killing mario");
		
	} 
	public void printName() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
}