
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.print("Type a temperature: ");
            double givenTemperature = Double.parseDouble(reader.nextLine()); 
            
            if(givenTemperature>= -30 && givenTemperature <= 40){
                Graph.addNumber(givenTemperature);
            }   
        }

    }
}
