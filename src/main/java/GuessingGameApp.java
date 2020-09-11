import java.util.Scanner;
//1. When the user guesses 7, the game announces they have won. All other numbers lose.
//2. When the user guesses 0, the game provides instructions for the user.
//3. After guessing, the user can take _one more_ guess (unless they won!)
//4. When the user guesses -1, the application should exit.
//5. The game should provide feedback that the secret number is > or < any incorrect guesses.
//6. The number should be random, instead of always 7.
public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        while (true) {
        System.out.println("Please guess a number between 1-10:");
        int guess = input.nextInt();
        int targetNumber = (int) (Math.random()) *10;
            if (guess == targetNumber) {
                System.out.println("You win!");
                correctGuess = true;
                break;
            }
            if (guess == 0) {
                System.out.println("0 is not a valid guess. Please guess a number between 1 and 10:");
                guess = input.nextInt();
                correctGuess = false;
                break;
            } else {
                System.out.println("Incorrect. You can take one more guess!:");
                guess = input.nextInt();
                correctGuess = false;
                System.out.println("Sorry, you lose!");
                break;
            }
        }
    }
    }

