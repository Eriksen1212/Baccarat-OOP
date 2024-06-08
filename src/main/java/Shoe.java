// TODO: Implement the Shoe class in this file
import java.util.Collections;

public class Shoe extends CardCollection {

    public Shoe(int numberOfDecks) {
        super();
        if (numberOfDecks != 6 && numberOfDecks != 8) {
            throw new CardException("Invalid number of decks: must be 6 or 8");
        }
        initializeDecks(numberOfDecks);
    }

    private void initializeDecks(int numberOfDecks) {
        for (int i = 0; i < numberOfDecks; i++) {
            for (Card.Suit suit : Card.Suit.values()) {
                for (Card.Rank rank : Card.Rank.values()) {
                    this.add(new BaccaratCard(rank, suit));
                }
            }
        }
    }

    // Shuffles the cards in the shoe
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Deals one card from the shoe
    public Card deal() {
        if (cards.isEmpty()) {
            throw new CardException("Cannot deal from an empty shoe");
        }
        return cards.remove(0);
    }

    // Returns the number of cards left in the shoe
    public int size() {
        return cards.size();
    }
}
