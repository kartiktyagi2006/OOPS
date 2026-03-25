import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        // 🔹 INSERTION
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After Insertion: " + fruits);

        // 🔹 UPDATION (Remove + Add)
        fruits.remove("Banana");
        fruits.add("Orange");

        System.out.println("After Updation: " + fruits);

        // 🔹 DELETION
        fruits.remove("Apple");

        System.out.println("After Deletion: " + fruits);
    }
}

