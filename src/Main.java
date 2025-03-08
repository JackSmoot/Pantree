
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "recipes.txt";

    public static void main(String[] args) {
        ArrayList<Recipe> recipes = loadRecipes();
        System.out.println(recipes.get(0).getIngredients());
        // Print all recipes
//        for (Recipe recipe : recipes) {
//            System.out.println(recipe);
//        }
        System.out.println("######################################");
        System.out.println(recipes.get(0));
        System.out.println("######################################");

    }

    public static ArrayList<Recipe> loadRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                // Check for the start of a new recipe
                if (line.startsWith("===")) {
                    // Read recipe name
                    String name = scanner.nextLine().substring("Name: ".length()).trim();

                    // Read instructions
                    String instructions = scanner.nextLine().substring("Instructions: ".length()).trim();

                    // Read ingredients
                    String ingredientsLine = scanner.nextLine().substring("Ingredients: ".length()).trim();
                    String[] ingredientNames = ingredientsLine.split(", ");
                    ArrayList<Ingredient> ingredients = new ArrayList<>();
                    for (String ingredientName : ingredientNames) {
                        ingredients.add(new Ingredient(ingredientName));
                    }

                    // Create and add the Recipe object
                    recipes.add(new Recipe(name, instructions, ingredients));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return recipes;
    }
}
