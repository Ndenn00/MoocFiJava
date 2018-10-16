import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Write your name: ");
        String givenName = reader.nextLine(); 
        reverseName(givenName);
        
        
    }
    
    public static void reverseName(String name){
        for(int i = 0; i < name.length(); i++){
            System.out.print(name.charAt((name.length()-1) - i));
        }
        System.out.println("");
    }
}
