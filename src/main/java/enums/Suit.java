package enums;

public enum Suit {
	Heart(1),
	Spade(2),
	Club(3),
	Diamond(4);

	private int suitValue;
	
	private Suit(int suitValue){
		this.suitValue = suitValue;
	}
	
	public int getsuitValue(){
		return suitValue;
	}
}
