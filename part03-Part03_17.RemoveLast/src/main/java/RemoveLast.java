
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        removeLastValue(list);
        System.out.println(list);
    }
    public static void removeLastValue(ArrayList<Integer> numbers){
        numbers.remove(numbers.size() -1);
    }

}
