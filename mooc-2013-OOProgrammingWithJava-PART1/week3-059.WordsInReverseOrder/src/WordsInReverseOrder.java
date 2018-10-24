import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(); 
        String givenWord; 
        
        while(true){
            System.out.print("Type a word: ");
            givenWord = reader.nextLine(); 
            
            if(givenWord.isEmpty() || givenWord.trim().length() == 0){
                break; 
            }
            list.add(givenWord); 
        }
        Collections.reverse(list);
        System.out.println("You typed the following: ");
        
        for(String s: list){
            System.out.println(s);
        }
    }
}
