package pokerBase;

import enums.Rank;
import enums.Suit;
import java.util.Comparator;

public class Card {
	private Rank rank;
	private Suit suit;
	private int cardNumber;

	public Card(Rank rank, Suit suit, int cardNumber) {
		this.rank = rank;
		this.suit = suit;
		this.cardNumber = cardNumber;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getCardNumber() {
		return cardNumber;
	}
	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.getRank().getiRankNbr();
		   int Cno2 = c2.getRank().getiRankNbr();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};
	   
	public int compareTo(Object o) {
	    Card c = (Card) o; 
	    return c.getRank().compareTo(this.getRank()); 

}
	@Override 
	public String toString(){
		return this.getRank() + "of" + this.getSuit();
	}   

}
