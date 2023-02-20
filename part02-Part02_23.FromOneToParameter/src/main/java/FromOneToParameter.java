

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(10);
    }

    public static void printUntilNumber(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
