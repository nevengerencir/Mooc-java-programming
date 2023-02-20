
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String dish) {
        if (!meals.contains(dish)) {
            meals.add(dish);
        } ;
    }

    public void clearMenu() {
        meals.clear();
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    // implement the required methods here
}
