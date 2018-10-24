import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String givenWord; 
        
        while(true){
            System.out.print("Type a word: ");
            
            givenWord = reader.nextLine(); 
            if(givenWord.trim().length() == 0 || givenWord.isEmpty()){
                break; 
            }
            words.add(givenWord); 
        }
        System.out.println("You typed the following words: ");
        
        for(String s: words){
            System.out.println(s);
        }
    }
}
