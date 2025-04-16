import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            int guess = 0;
            boolean win = false;
            System.out.println("Welcome to the Guess the Number Game!");
            System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
            while (!win) {
                System.out.print("Enter your guess: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                    continue;
                }
                guess = scanner.nextInt();
                numberOfTries++;
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    win = true;
                    System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                }
            }
        }
    }
}
