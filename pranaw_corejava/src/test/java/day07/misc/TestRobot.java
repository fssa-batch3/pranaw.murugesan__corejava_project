package day07.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRobot {
	@Test
	public void validTestRobot() {

		Assertions.assertEquals(true, Robot.isCorrect("green"));
	}

	@Test
	public static void InvalidTestRobot() {

		Assertions.assertEquals(false, Robot.isCorrect("green"));
	}
}
