package fuchimi;

public class Rock extends Hand{

	@Override
	public Boolean beats(Hand hand) {
		// TODO Auto-generated method stub

		return hand.loseAgainst(this);
	}

	@Override
	protected Boolean loseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return new Boolean(true);
	}

	@Override
	protected Boolean loseAgainst(Scissors Scissors) {
		// TODO Auto-generated method stub
		return new Boolean(false);
	}

	
	public String toString() {

		String s = "Rock";
		return s;
	}

}
