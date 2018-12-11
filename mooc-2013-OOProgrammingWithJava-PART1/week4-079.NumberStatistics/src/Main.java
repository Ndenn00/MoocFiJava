
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true) {
            int givenNumber = Integer.parseInt(reader.nextLine());
            if (givenNumber == -1) {
                break;
            }
            stats.addNumber(givenNumber);
            if (givenNumber % 2 == 0) {
                even.addNumber(givenNumber);
            } else {
                odd.addNumber(givenNumber);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
