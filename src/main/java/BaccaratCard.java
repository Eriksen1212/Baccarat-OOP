// TODO: Implement the BaccaratCard class in this file
public class BaccaratCard extends Card {

    // Constructor that accepts rank and suit
    public BaccaratCard(Rank rank, Suit suit) {
        super(rank, suit);
    }

    // Method to get the card's value for Baccarat
    public int value() {
        switch (getRank()) {
            case ACE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            default:
                return 0;  // For TEN, JACK, QUEEN, KING
        }
    }

    // Override the toString method to use two-character representation
    @Override
    public String toString() {
        return String.format("%s%s", getRank().getSymbol(), getSuit().getSymbol());
    }
}