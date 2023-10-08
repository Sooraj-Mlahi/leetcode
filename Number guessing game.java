import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the number guessing game.");
        System.out.println("I chose a number between " + min + " and " + max + ".");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Try to guess it:");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < min || userGuess > max) {
                System.out.println("Please choose a number between " + min + " and " + max + ".");
            } else if (userGuess < numberToGuess) {
                System.out.println("My number is higher.");
            } else if (userGuess > numberToGuess) {
                System.out.println("My number is lower.");
            } else {
                System.out.println("Congrats! You guessed the number " + numberToGuess + " in " + attempts + " tries.");
                hasGuessedCorrectly = true;
            }
        }
        
        scanner.close();
    }
}
