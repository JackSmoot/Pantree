public class IDGen {

    public static int generateID(String name) {
        return name.hashCode();
    }
    
}
