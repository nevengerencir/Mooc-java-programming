
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");

        }`
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");

        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int row = 1; row <= size; row++) {
            printSpaces(size - row);
            printStars(row);
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int row = 1; row <= height; row++) {
            printSpaces(height - row);
            printStars(row);
            printStars(row - 1);
            System.out.println("");
        }
        printSpaces(height - 2);
        printStars(3);
        System.out.println("");
        printSpaces(height - 2);
        printStars(3);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.


        christmasTree(7);
    }
}
