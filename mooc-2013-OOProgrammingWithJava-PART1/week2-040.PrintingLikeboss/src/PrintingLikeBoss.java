
public class PrintingLikeBoss {

    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void printWhitespaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {

        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
            
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        
        for(int i = 0; i < height; i++) {
            printWhitespaces(height - (i + 1));
            printStars(2 * i + 1);
            
        }

        for (int n = 1; n < 3; n++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(3);
    }
}
