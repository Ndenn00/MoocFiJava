
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        String givenRadius = reader.nextLine();
        int parsedRadius= Integer.parseInt(givenRadius); 
        
        double circumfrence = 2*Math.PI*parsedRadius; 
        
        System.out.println("Circumfrence of the circle: " + circumfrence);
        
        
    }
}
