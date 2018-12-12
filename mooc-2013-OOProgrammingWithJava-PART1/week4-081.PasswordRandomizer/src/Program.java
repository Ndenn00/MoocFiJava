public class Program {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        int indexOfB; 
        String givenString = randomizer.createPassword(); 
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        indexOfB = givenString.indexOf("b"); 
        System.out.println(indexOfB);
    }
}
