
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number: ");
        int givenNumber = Integer.parseInt(reader.nextLine()); 
       
        for(int i = 1; i <= givenNumber; i++){
            System.out.println(i);
        }
    }
}
