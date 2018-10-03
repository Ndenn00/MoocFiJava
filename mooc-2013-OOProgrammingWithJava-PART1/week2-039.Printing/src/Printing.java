
public class Printing {

    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  
        printSquare(4);
        System.out.println("\n---");
        printRectangle(15, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
