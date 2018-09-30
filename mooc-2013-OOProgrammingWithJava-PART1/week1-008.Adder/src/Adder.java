
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        String givenFirstNo = reader.nextLine(); 
        
        System.out.print("Type another number: ");
        String givenSecondNo = reader.nextLine(); 
        
        int firstNo = Integer.parseInt(givenFirstNo);
        int secondNo = Integer.parseInt(givenSecondNo);
        int sum = firstNo+secondNo; 
        System.out.println("");      
        System.out.println("Sum of the numbers: " + sum);
        
        
        
    }
}
