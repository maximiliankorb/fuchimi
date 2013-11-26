package fuchimi;

public abstract class Hand {
	
	public abstract boolean beats(Hand hand);
	protected abstract boolean loseAgainst(Rock rock);
	protected abstract boolean loseAgainst(Paper paper);
	protected abstract boolean loseAgainst(Scissors Scissors);



}
