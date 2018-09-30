
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]");
        
        int givenNumber = reader.nextInt(); 
        
        if(givenNumber <= 29){
            System.out.println("Grade: failed");
        } else if (givenNumber >= 30 && givenNumber <= 34){
            System.out.println("Grade: 1");
        } else if (givenNumber >= 35 && givenNumber <= 39){
            System.out.println("Grade: 2");
        } else if (givenNumber >= 40 && givenNumber <= 44){
            System.out.println("Grade: 3");
        } else if (givenNumber >= 45 && givenNumber <= 49){
            System.out.println("Grade: 4");
        } else if (givenNumber >= 50 && givenNumber <= 60){
            System.out.println("Grade: 5");
        }
        
    }
}
