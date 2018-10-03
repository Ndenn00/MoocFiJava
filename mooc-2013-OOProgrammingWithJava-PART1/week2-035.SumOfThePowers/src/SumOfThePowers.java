
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int givenNumber = Integer.parseInt(reader.nextLine()); 
        int sum = 0; 
        
        if(givenNumber > 0){
            for(int i = 0; i <= givenNumber; i++){
                sum += Math.pow(2, i); 
            }
        }
        
        System.out.println("The result is: "+sum);
    }
}
