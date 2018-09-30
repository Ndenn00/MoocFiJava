
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int givenNumber = reader.nextInt(); 
        
        if(givenNumber % 2 == 0){
            System.out.println("Number " + givenNumber + " is even.");
        } else {
             System.out.println("Number " + givenNumber + " is odd.");
        }

    }
}
