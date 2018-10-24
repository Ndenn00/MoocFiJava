
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String givenWord;

        while (true) {
            System.out.print("Type a word: ");

            givenWord = reader.nextLine();

            if (list.contains(givenWord)) {
                break;

            }
            list.add(givenWord);

        }
        System.out.println("You gave twice the word " + givenWord);

    }
}
