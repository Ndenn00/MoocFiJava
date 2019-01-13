
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    private final int LOSING_FAULT_AMOUNT = 12;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {

        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return LOSING_FAULT_AMOUNT;
    }

    public void guessLetter(String letter) {

        incrementGuessedLetterIfNotPresent(letter);

        ifWordContainsGivenLetter(letter);

    }

    public boolean wordContainsLetter (String letter){
        
        return this.guessedLetters.contains(letter) ? true: false; 
    }
    
    public void incrementGuessedLetterIfNotPresent(String letter) {

        if (!wordContainsLetter(letter)) {
            this.guessedLetters += letter;
        }
    }
    
    public void ifWordContainsGivenLetter(String letter){
        if (this.word.contains(letter.toUpperCase())) {

        } else {
            this.numberOfFaults++;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        
     
        String returnWord = ""; 
        
        for(int i = 0; i < this.word.length(); i++){
            
            returnWord += "_"; 
        }
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        return returnWord;
    }

}
