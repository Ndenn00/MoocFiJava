
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    private final int MINIMUM = 1;
    private final int MAXIMUM = 39;
    private final int SIZE_OF_DRAW = 7;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int newNumber;
        this.numbers = new ArrayList<Integer>();

        while (true) {
            newNumber = random.nextInt(MAXIMUM - MINIMUM + 1) + MINIMUM;
            if (!this.numbers.contains(newNumber)) {
                numbers.add(newNumber);
            }

            if (this.numbers.size() == SIZE_OF_DRAW) {
                break;
            }
        }
    }

    public boolean containsNumber(int number) {

        if (this.numbers.contains(number)) {
            return true;
        }

        return false;
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }
}
