package pokerBase;

import java.util.ArrayList;
import enums.Rank;
import enums.Suit;


public class Deck  {
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(){
		for(Rank rank: Rank.values()){
			for(Suit suit: Suit.values()){
				deck.add(new Card(rank, suit, 0));
			}
		}
		shuffledDeck(deck);
	}
	
	public int cardsLeft(){
		return deck.size();
	}
	
	public static void shuffledDeck(ArrayList<Card> deck){
		int size = deck.size();
		int randomInt;
		for (int i = 0; i < size; i++) {
			do {
				randomInt = (int) (Math.random() * size);
			}
			while (randomInt ==i);
			Card temporaryCard = deck.get(randomInt);
			deck.set(randomInt, deck.get(i));
			deck.set(i, temporaryCard);
			}
		}
	
	public Card Draw(){
		return deck.remove(0);
	}
}


