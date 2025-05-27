import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            if (guess > numberToGuess)
                System.out.println("Too high!");
            else if (guess < numberToGuess)
                System.out.println("Too low!");
            else
                System.out.println("Correct!");
        } while (guess != numberToGuess);
    }
}