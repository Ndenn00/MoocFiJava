
import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private Random random = new Random();
    private final int NUMBER_OF_LETTERS = 26;
    private final int SMALLEST_VIABLE_LENGTH = 1;

    public PasswordRandomizer(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = SMALLEST_VIABLE_LENGTH;
        }
    }

    public String createPassword() {

        String returnPassword = "";

        for (int i = 0; i < this.length; i++) {
            returnPassword += getRandomChar();
        }
        return returnPassword;
    }

    private char getRandomChar() {
        return "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(NUMBER_OF_LETTERS));
    }

    public int getLength() {
        return this.length;
    }

}
