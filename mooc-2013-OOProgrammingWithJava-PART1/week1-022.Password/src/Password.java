
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; 
        boolean userGaveCorrectPassword = false; 
        
        while (!userGaveCorrectPassword){
            System.out.print("Type the password: ");
            String givenPassword = reader.nextLine(); 
            if(givenPassword.equalsIgnoreCase(password)){
                System.out.println("Right!");
                break; 
            } else {
                System.out.println("Wrong!");
            }             
        }
        
        System.out.println("The secret is: boj taerg!");
        
    }
}
