
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
 
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        String givenFirstNo = reader.nextLine(); 
        
        System.out.print("Type another number: ");
        String givenSecondNo = reader.nextLine(); 
        
        double firstNo = Double.parseDouble(givenFirstNo);
        double secondNo = Double.parseDouble(givenSecondNo);
        double sum = firstNo/secondNo; 
        System.out.println("");      
        System.out.println("Division: "+ firstNo + " / " + secondNo + " = "+ sum);
        
    }
}
