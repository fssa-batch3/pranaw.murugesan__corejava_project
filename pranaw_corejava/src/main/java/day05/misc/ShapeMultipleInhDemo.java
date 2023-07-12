package day05.misc;

abstract class Shape {
	public abstract void draw();
	public abstract void shape();
}

class Rectangle2 extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}

	@Override
	public void shape() {
		System.out.println("shape from rectangle2");
		
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}

	@Override
	public void shape() {
		System.out.println("shape from from square");
		
	}
}

public class ShapeMultipleInhDemo {
	public static void main(String[] args) {
		Shape rec = new Rectangle2();
		Shape square = new Square();
		rec.draw();
		square.draw();
		Shape rectangle2 = new Rectangle2();
		rectangle2.shape();
		
	}
}