
public class Least {

    public static int least(int number1, int number2) {
        if(number1>number2){
            return number2; 
        } else if(number2>number1){
            return number1; 
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
