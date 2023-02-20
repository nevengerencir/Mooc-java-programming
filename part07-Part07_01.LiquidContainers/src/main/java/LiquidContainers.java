
import java.util.Scanner;

public class LiquidContainers {
   static Container first = new Container(0);
   static Container second = new Container(0);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first.getLiters()+"/100");
            System.out.println("Second: " + second.getLiters()+"/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("add")){
                first.add(Integer.valueOf(parts[1]));
            }else if (parts[0].equals("move")){
                first.move(Integer.valueOf(parts[1]),second);
            }
            else if (parts[0].equals("remove")){
                first.remove(Integer.valueOf(parts[1]));
            }
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
