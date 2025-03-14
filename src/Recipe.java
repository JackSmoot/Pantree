import java.util.ArrayList;

public class Recipe {
    private String name;
    private String instructions;
    private ArrayList<Ingredient> ingredients;

    private int calories;
    private int servings;

    public Recipe(String name, String instructions, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.instructions = instructions;
        this.ingredients = ingredients;
        calories = totalCalories();
        servings = 1;//user input
    }

    private int totalCalories() {
        int total = 0;
        for (Ingredient i : ingredients) {
            total+=i.getCalories();
        }
        return total;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getInstructions() {
        return instructions;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories * servings;
    }

    public String toString() {
        return "Recipe{" + name + " : " + instructions + " : " + ingredients + " : " + calories + "}";
    }

}