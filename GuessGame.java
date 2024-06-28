import java.util.*;
public class GuessGame {
    public static int computerGuess(int min, int max) {
        return (min + max) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;
        int compGuess = 0;
        int userCount = 0;
        int compCount = 0;
        int min = 1;
        int max = 100;
        boolean userWon = false;
        boolean compWon = false;
        System.out.println("Enter a number between 1 to 100");
        int randomNo = (int) (Math.random() * 100 + 1);

        while (!userWon && !compWon) {
            System.out.println("Your turn.");
            userGuess = sc.nextInt();
            userCount++;
            if (userGuess < randomNo) {
                System.out.println("OOPS!! It's Lower than your Guess :(");
            } else if (userGuess > randomNo) {
                System.out.println("Guess becomes Higher!!!");
            } else {
                System.out.println("WOHOO!!! You got it");
                userWon = true;
                break;
            }
            compGuess = computerGuess(min, max);
            compCount++;
            System.out.println("Computer's turn: " + compGuess);

            if (compGuess < randomNo) {
                System.out.println("OOPS!! It's Lower than Computer's Guess :(");
                min = compGuess + 1;
            } else if (compGuess > randomNo) {
                System.out.println("Computer's guess is Higher!!!");
                max = compGuess - 1;
            } else {
                System.out.println("Computer got it!");
                compWon = true;
                break;
            }
        }
        if (userWon) {
            System.out.println("Congratulations! You guessed the number in " + userCount + " attempts.");
            System.out.println("You win!");
        } else if (compWon) {
            System.out.println("Computer guessed the number in " + compCount + " attempts.");
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}

