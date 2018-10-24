
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type second word: ");
        String secondWord = reader.nextLine();
        System.out.println(wordInsideWord(firstWord, secondWord));
    }

    public static String wordInsideWord(String firstWord, String secondWord) {
        return (firstWord.contains(secondWord))? 
                "The word '" + secondWord + "' is found in the word '" + firstWord+ "'." :
                "The word '" + secondWord + "' is not found in the word '" + firstWord+ "'.";
       
    }

}
