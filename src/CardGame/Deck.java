package CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private String[] suits = new String[] {"Hearts", "Diamonds", "Clubs", "Spades"};
	private String[] values = new String[] {
			"Two", "Three", "Four", "Five",
			"Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King", "Ace"
	};
	
	public Deck(){
		for (String suit : suits) {
			int i = 2;
			for (String value : values){
				cards.add(new Card(value + " of " + suit, i++));
			}
		}
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}

}
