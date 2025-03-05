import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String instructions;
    private ArrayList<Ingredient> ingredients;

    public Recipe(String name, String instructions, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.instructions = instructions;
        this.ingredients = ingredients;
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

    public String toString() {
        return "Recipe{name='" + name + "', instructions='" + instructions + "', ingredients=" + ingredients + "}";
    }

}