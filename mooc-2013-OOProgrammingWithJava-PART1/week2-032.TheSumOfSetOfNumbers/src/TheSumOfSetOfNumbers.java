
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what: ");
        int givenNumber = Integer.parseInt(reader.nextLine()); 
        int sum = 0; 
        for(int i = 0; i <= givenNumber; i++){
            sum += i; 
        }
        
        System.out.println("Sum is "+sum);
    
    }
}
