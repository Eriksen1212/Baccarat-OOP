// TODO: Implement the BaccaratHand class in the file
/*import java.util.List;
import java.util.LinkedList;*/

public class BaccaratHand extends CardCollection {

    public BaccaratHand() {
        super();
    }

     // Returns the total value of the hand in Baccarat.
    @Override
    public int value() {
        int totalValue = 0;
        //for (Card card : cards) 
        for (Card card : cards){
            totalValue += ((BaccaratCard) card).value();
        }
        return totalValue % 10;  // Baccarat values are the sum modulo 10
    }

    public boolean isNatural() {
        return cards.size() == 2 && (value() == 8 || value() == 9);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();  // Trim the trailing space
    }
    
}
