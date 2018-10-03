
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        boolean flag = false;
        int givenNumber, sum, countOfOdd, countOfEven;
        countOfEven = 0;
        countOfOdd = 0;
        sum = 0;

        do {
            givenNumber = Integer.parseInt(reader.nextLine());

            if (givenNumber == -1) {
                break;
            }
            
            sum += givenNumber;

            if (givenNumber % 2 == 0) {
                countOfEven++;
            } else {
                countOfOdd++;
            }

        } while (true);
        

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + (countOfEven + countOfOdd));
        System.out.println("Average: " + ((double)sum / (double)(countOfEven + countOfOdd)));
        System.out.println("Even numbers: " + countOfEven);
        System.out.println("Odd numbers: " + countOfOdd);
    }
}
