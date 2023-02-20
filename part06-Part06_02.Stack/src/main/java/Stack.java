import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> values() {
        return stack;
    }
    public void add(String element){
        stack.add(element);
    }
    public String take(){
        String element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return element;
    }
}
