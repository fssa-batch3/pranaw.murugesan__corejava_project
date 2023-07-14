package day06.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class Validator {
	@Test
	public static void main(String[] args) {
		validatorForAll();
	}

	public static void validatorForAll() {
		testRemoveDuplicate();
	}

	@Test
	public static void testRemoveDuplicate() {
		List<String> cityList = new ArrayList<>(Arrays.asList("Chennai", "Bangalore", "Mumbai", "Mumbai"));
		List<String> expectedUniqueValues = new ArrayList<>(Arrays.asList("Chennai",  "Mumbai","Bangalore"));

		List<String> result = Practice1.removeDuplicate(cityList);

		Assertions.assertEquals(expectedUniqueValues, result);
	}
}
