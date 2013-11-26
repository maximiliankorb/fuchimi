package fuchimi;

public class Rock extends Hand{

	@Override
	public boolean beats(Hand hand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean loseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean loseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean loseAgainst(Scissors Scissors) {
		// TODO Auto-generated method stub
		return false;
	}

}
