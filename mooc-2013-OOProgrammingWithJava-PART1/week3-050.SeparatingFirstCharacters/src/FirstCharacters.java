
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Print name: ");
        String givenname = reader.nextLine();
        firstCharacters(givenname);
    }

    public static void firstCharacters(String name) {
        if (name.length() >= 3) {
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }

    }
}
