
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a name: ");
        String givenName = reader.nextLine();
        System.out.print("Length of first part: ");
        int givenLength = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + endPart(givenName, givenLength));
    }

    public static String endPart(String name, int size) {
        if (size < name.length()) {
            
            return name.substring(name.length()-size, name.length()); 
        }
        return name;
    }
    
    
}
