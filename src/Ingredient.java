public class Ingredient {
    private int id;
    private String name;

    public Ingredient(String name) {
        this.name = name;
        id =  IDGen.generateID(name);
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