
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type name: ");
        String givenName = reader.nextLine();
        seperatingCharacters(givenName);
        
    }
    
    public static void seperatingCharacters(String name){
        for (int i = 0; i < name.length(); i++){
            System.out.println(i+1 +". character: "+ name.charAt(i));
        }
        
    }
}
