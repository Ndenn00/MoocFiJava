
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int givenNumber = Integer.parseInt(reader.nextLine()); 
        
        if(givenNumber > 0){
            System.out.println("This number is positive.");
        } else {
            System.out.println("This number is not positive.");
        }
    }
}
