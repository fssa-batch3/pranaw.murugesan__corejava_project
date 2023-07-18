package day08.practice;

public class Validator {
	public static boolean validateString(String str) throws IllegalArgumentException{
		if(str == null || "".equals(str.trim()) || str.length() > 3) {
			throw new IllegalArgumentException("String should not be empty");
		}
		return false;

	}
}
