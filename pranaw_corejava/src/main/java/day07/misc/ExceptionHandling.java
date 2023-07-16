package day07.misc;

public class ExceptionHandling {
	public static void main(String[] args) {
//		try {
//			int x = 100 / 0;
//			System.out.println(x); // it should not print if exception happens
//		} catch (ArithmeticException e) {
//			throw new ArithmeticException("you're diving by zero"); // constructor
//		}
		System.out.println(divide(10, 0));
	}

	public static int divide(int x, int y) throws ArithmeticException{
		try {
			int answer = x / y;
			return answer;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			throw new ArithmeticException("you're diving by zero"); // constructor
		}

	}

}
