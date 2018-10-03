
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what: ");
        int givenNumber = Integer.parseInt(reader.nextLine());

        int sum = 1;

        if (givenNumber != 0) {

            for (int i = 1; i <= givenNumber; i++) {
                sum *= i;
            }

        } else {
            sum = 1;
        }

        System.out.println("Sum is " + sum);

    }
}
