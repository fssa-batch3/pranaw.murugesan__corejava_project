package day10.misc;

public class Divider {
	public static int divisor(int a, int b) throws IllegalArgumentException{
		if(b==0) {
			throw new IllegalArgumentException("divisor can't be zero"); 
			// if i change Exception from IllegalArgumentException, compiler error will happen, because Exception class is checked exception 
			// whereas IllegalArgumentException is unchecked
		}
		
		int c = a/b;
		return c;
		
	}
	public static void main(String[] args) {
		divisor(5, 0);
	}
}
