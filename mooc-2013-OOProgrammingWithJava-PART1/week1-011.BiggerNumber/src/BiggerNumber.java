
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        String givenFirstNo = reader.nextLine();
        System.out.print("Type another number: ");
        String givenSecondNo = reader.nextLine();
        System.out.println("");
        int parsedFirstNo = Integer.parseInt(givenFirstNo);
        int parsedSecondNo = Integer.parseInt(givenSecondNo);
        
        int largestNo = Math.max(parsedFirstNo, parsedSecondNo);
        
        System.out.println("The bigger number of the two numbers given was: "+ largestNo);
    }
}
