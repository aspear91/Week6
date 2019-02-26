package CardGame;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player("Sam");
		Player player2 = new Player("Sally");
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			int p1Value = player1.flip().getValue();
			int p2Value = player2.flip().getValue();
			
			if (p1Value == p2Value) {
				System.out.println("Draw!");
			}else {
				if (p1Value > p2Value) {
					player1.incrementScore();
				} else {
					player2.incrementScore();
				}
			}
		}
		player1.describe();
		player2.describe();

		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 " + player1.getName() + " is victorious!");
		} else if (player1.getScore() < player2.getScore()){
			System.out.println("Player 2 " + player2.getName() + " is victorious!");
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("The game ends in a draw!");
		}
	}

}
