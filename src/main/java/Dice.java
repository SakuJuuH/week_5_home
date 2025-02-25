import java.util.Random;

public class Dice {

	private int die1 = 0;
	private int die2 = 0;

	static Random rand = new Random();

	public Dice() {
	}

	public int getDie1() {
		return die1;
	}

	public int getDie2() {
		return die2;
	}

	public void setDie1(int die1) {
		this.die1 = die1;
	}

	public void setDie2(int die2) {
		this.die2 = die2;
	}

	public void roll() {
		int count = 0;
		while (!isEqual()) {
			System.out.println("Rolling the dice...");
			this.die1 = rand.nextInt(1, 7);
			this.die2 = rand.nextInt(1, 7);
			System.out.printf("Die 1: %d%n", getDie1());
			System.out.printf("Die 2: %d%n", getDie2());
			System.out.println(isEqual() ? "You rolled a double!" : "Try Again.");
			System.out.println();
			count++;
		}
		System.out.printf("After %d attempts, both dice reach the same value.%n", count);
	}

	public boolean isEqual() {
		if (die1 != 0 && die2 != 0) {
			return die1 == die2;
		}
		return false;
	}
}
