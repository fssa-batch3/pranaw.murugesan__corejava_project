package day04.misc;

public class Main {

}

abstract class Player {

	public abstract void shoot();
}

interface Loots { // interface is nothing but replacement of abstract class

	public void takeGuns(); // it should be considered as abstract method
}

interface Flare extends Loots {
	public void shootFlare();
}

class Pranaw extends Player implements Flare {

	@Override
	public void shoot() {
		System.out.println("shooting");
	}

	@Override
	public void takeGuns() {
		System.out.println("taking guns");
	}


	@Override
	public void shootFlare() {
		
	}

}