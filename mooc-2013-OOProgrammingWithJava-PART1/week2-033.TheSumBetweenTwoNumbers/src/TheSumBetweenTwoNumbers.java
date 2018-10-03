
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int givenFirstNumber = Integer.parseInt(reader.nextLine()); 
        System.out.print("Second: ");
        int givenSecondNumber = Integer.parseInt(reader.nextLine());
        int sum = 0; 
        int counter = 0; 
        
        if(givenFirstNumber<=givenSecondNumber){
           while(givenFirstNumber <= givenSecondNumber){
               sum+=givenFirstNumber; 
               givenFirstNumber++; 
           }
        }
        
        System.out.println("Sum is "+sum);
    }
}
