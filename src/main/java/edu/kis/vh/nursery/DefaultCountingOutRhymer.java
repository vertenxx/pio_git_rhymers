package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int BEGIN_VAL = -1;
	private static final int LAST_INDEX = 11;
	private final int[] numbers = new int[SIZE];

	private int total = BEGIN_VAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == BEGIN_VAL;
	}

	public boolean isFull() {
		return total == LAST_INDEX;
	}

	protected int peekaboo() {
		if (callCheck())
			return BEGIN_VAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return BEGIN_VAL;
		return numbers[total--];
	}
}
