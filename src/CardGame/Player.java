package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	
	public String getName() {
		return ("-" + name + "-");
	}

	public Player(String name){
		this.name = name;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void describe() {
		System.out.println("Player: " + name + " Score: " + score);
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}

}
