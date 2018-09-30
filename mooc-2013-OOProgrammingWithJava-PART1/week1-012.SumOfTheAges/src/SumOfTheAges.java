
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String givenFirstName = reader.nextLine();
        System.out.print("Type your age: ");
        int givenFirstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.print("Type your name: ");
        String givenSecondName = reader.nextLine();
        System.out.print("Type your age: ");
        int givenSecondAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.println(givenFirstName+" and " + givenSecondName + " are " + (givenFirstAge+givenSecondAge) + " years old in total");
        
        
        
        

        
    }
}
