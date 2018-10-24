
import java.util.Arrays;
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        char[] word = new char[text.length()]; 
        for(int i = 0; i < text.length(); i++){
            word[(text.length()-1) - i] = text.charAt(i); 
        }
        
        return new String(word);
    }
    
    public static String reverse2(String text) {
       String returnString = ""; 
       
       for(int i  = 0; i < text.length(); i ++){
           returnString+= text.charAt(text.length()-1-i); 
       }
       
       return returnString; 
    }
    
    

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
        System.out.println("In reverse order: " + reverse2(text));
    }
}
