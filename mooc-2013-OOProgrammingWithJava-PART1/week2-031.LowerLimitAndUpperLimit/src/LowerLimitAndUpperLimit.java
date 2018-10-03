
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int givenFirstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int givenSecondNumber = Integer.parseInt(reader.nextLine());
        if(givenFirstNumber<=givenSecondNumber){
            for(;givenFirstNumber <= givenSecondNumber; givenFirstNumber++){
                System.out.println(givenFirstNumber);  
            }
        }

    }
}
