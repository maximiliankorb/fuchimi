package fuchimi;

public class Scissors extends Hand {

	@Override
	public Boolean beats(Hand hand) {
		// TODO Auto-generated method stub

		return hand.loseAgainst(this);
	}

	@Override
	protected Boolean loseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return new Boolean(true);
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return new Boolean(false);
	}

	@Override
	protected Boolean loseAgainst(Scissors Scissors) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String toString() {

		String s = "Scissors";
		return s;
	}
}