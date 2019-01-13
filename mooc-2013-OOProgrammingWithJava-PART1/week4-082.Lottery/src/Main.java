import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
        
        LotteryNumbers lotteryNumbers2 = new LotteryNumbers();
        ArrayList<Integer> numbers2 = lotteryNumbers2.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers2) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
