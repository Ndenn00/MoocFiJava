
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn, givenNumber, attempts;
        numberDrawn = drawNumber();
        attempts = 0;
        
        while (true) {
            attempts++;
            System.out.print("Guess a number: ");
            givenNumber = Integer.parseInt(reader.nextLine());
            if (givenNumber > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+attempts);
            } else if (givenNumber < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+attempts);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }

// DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
