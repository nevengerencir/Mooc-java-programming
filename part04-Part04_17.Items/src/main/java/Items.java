
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Name:");
            String name=scanner.nextLine();
            if (name.isEmpty()){
                System.out.println( "Persons in total: " +items.size());
                System.out.println( "Persons:");
                for(Item person : items){
                  System.out.println(person);
                }
                return;
            }
            items.add(new Item(name));
    }

    }

}
