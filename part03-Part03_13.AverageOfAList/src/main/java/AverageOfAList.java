
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if( number == -1){
                break;
            }
            list.add(number);
        }
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        int average = 0;
        for (int number : list ){
            average += number;
        }
        System.out.println("Average: " + (double) average / list.size());
        // and prints it.
        
    }
}
