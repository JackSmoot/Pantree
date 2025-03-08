public class Ingredient {
    private int id;
    private String name;
    private int calories;

    public Ingredient(String name) {
        this.name = name;
        id =  IDGen.generateID(name);
        calories = 100;
    }

    public int getCalories() {
        return calories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Ingredient{id=" + id + ", name='" + name + "'}";
    }

}