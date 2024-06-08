/*public class Baccarat {
  // TODO: Implement your Baccarat simulation program here
}*/
import java.util.Scanner;

public class Baccarat {

    public static void main(String[] args) {
        // Initialize game variables
        Shoe shoe = new Shoe(6);
        shoe.shuffle();

        int roundsPlayed = 0;
        int playerWins = 0;
        int bankerWins = 0;
        int ties = 0;

        Scanner scanner = new Scanner(System.in);
        boolean isInteractive = args.length > 0 && (args[0].equals("-i") || args[0].equals("--interactive"));

        // Main game loop
        while (shoe.size() >= 6) {
            roundsPlayed++;

            // Initialize hands
            BaccaratHand playerHand = new BaccaratHand();
            BaccaratHand bankerHand = new BaccaratHand();

            // Deal cards
            playerHand.add(shoe.deal());
            bankerHand.add(shoe.deal());
            playerHand.add(shoe.deal());
            bankerHand.add(shoe.deal());

            // Determine and display winner
            int playerValue = playerHand.value();
            int bankerValue = bankerHand.value();
            System.out.println("Round " + roundsPlayed);
            System.out.println("Player: " + playerHand + " = " + playerValue);
            System.out.println("Banker: " + bankerHand + " = " + bankerValue);

            if (playerValue > bankerValue) {
                playerWins++;
                System.out.println("Player wins!");
            } else if (playerValue < bankerValue) {
                bankerWins++;
                System.out.println("Banker wins!");
            } else {
                ties++;
                System.out.println("Tie");
            }

            // Check for next round if in interactive mode
            if (isInteractive) {
                System.out.print("Another round? (y/n): ");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (!"y".equals(answer)) {
                    break;
                }
            }
        }

        // Display game results
        System.out.println("\n" + roundsPlayed + " rounds played");
        System.out.println(playerWins + " player wins");
        System.out.println(bankerWins + " banker wins");
        System.out.println(ties + " ties");
        

        // Close the scanner
        scanner.close();

    }
    
}



