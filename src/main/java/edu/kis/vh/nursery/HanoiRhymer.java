package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int NO_REJECTIONS = 0;
	private int totalRejected = NO_REJECTIONS;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
	// Źle byly sformatowane? 5,14,15