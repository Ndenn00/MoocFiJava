
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int givenAge = reader.nextInt();
        
        if(givenAge <0 || givenAge > 120){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
        
  
    }
}
