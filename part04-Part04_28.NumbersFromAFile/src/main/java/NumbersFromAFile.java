
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        int count =0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner scannerFile = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scannerFile.hasNextLine()) {
                // we read one line
                int number = Integer.valueOf(scannerFile.nextLine());
                // we print the line that we read
                numbers.add(number);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    for(Integer number : numbers){
        if (number<=upperBound && number>=lowerBound){
            count++;
        }
    }
    System.out.println("Numbers: " + count);
    }
}
