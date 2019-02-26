package CardGame;

public class Card {

	
	private int value;
	private String name;
	
	public Card(String name, int value){
		this.value = value;
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Name: " + name + " Value: " + value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
     