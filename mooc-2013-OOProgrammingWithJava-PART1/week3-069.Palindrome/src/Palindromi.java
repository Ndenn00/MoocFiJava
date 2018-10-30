import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        if(text.isEmpty() || text.trim().length() == 0){
            return true; 
        }
        
        for(int i = 0;  i < text.length(); i++){
        if(text.charAt(i) != text.charAt(text.length()-1 - i)){
            return false; 
        }
    }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = "racecar";    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
