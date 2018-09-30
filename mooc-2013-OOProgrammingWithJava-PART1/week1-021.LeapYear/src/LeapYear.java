
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int givenYear = reader.nextInt(); 
        
        if((givenYear % 4 == 0 && givenYear % 100 != 0) ||  (givenYear % 400 == 0)){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
