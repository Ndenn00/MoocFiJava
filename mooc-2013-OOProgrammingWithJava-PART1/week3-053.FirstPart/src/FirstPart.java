
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a name: ");
        String givenName = reader.nextLine(); 
        System.out.print("Length of first part: ");
        int givenLength = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + firstPart(givenName, givenLength));
    }
    
    public static String firstPart(String name, int length){
        return name.substring(0, length); 
        
    }
    
}
