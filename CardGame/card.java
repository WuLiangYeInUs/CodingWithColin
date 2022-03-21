public class Card implements Comparable<Card> {

	private int suit;

	private int value;


	/**

	 * Constructor for objects of class Card

	 */

	public Card() {

		suit = 0;

		value = 0;

	}


	public Card(int mySuit, int myValue) {

		suit = mySuit;

		value = myValue;

	}


	public int suit() {

		return suit;

	}


	public int value() {

		return value;

	}


	public String getValue() {

		String[] arr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

		return arr[value - 1];

	}


	public String getSuit() {

//		String output = "";

		switch (suit) {

		case 1:


//return "Clubs";

			return "\u2663";

		case 2:

//return "Diamonds";

			return "\u2666";

		case 3:

//return "Hearts";

			return "\u2665";

//return "\uD83C\uDF94";

		case 4:

//return "Spades";

			return "\u2660";

		default:

			return "Unknown suit type";


		}

//		return output;


	}


	public String toString() {

		return this.getValue() + this.getSuit();

	}


	public int compareTo(Card other) {

		if (this.value() > other.value())

			return 1;

		else if (this.value() < other.value())

			return -1;

		else

			return 0;

	}

}
