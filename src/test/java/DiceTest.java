import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiceTest {

	static Dice dice = new Dice();

	@BeforeEach
	void setup() {
		dice.setDie1(0);
		dice.setDie2(0);
	}

	@Test
	void getDie1Test() {
		assertEquals(0, dice.getDie1());
	}

	@Test
	void getDie2Test() {
		assertEquals(0, dice.getDie2());
	}

	@Test
	void rollTest() {
		dice.roll();
		int die1Result = dice.getDie1();
		int die2result = dice.getDie2();
		assertEquals(die1Result, dice.getDie1());
		assertEquals(die2result, dice.getDie2());
	}

	@Test
	void isEqualTest() {
		dice.roll();
		assertEquals(dice.getDie1(), dice.getDie2());
	}
}