import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        // 🔹 INSERTION
        students.put(1, "Rahul");
        students.put(2, "Amit");
        students.put(3, "Neha");

        System.out.println("After Insertion: " + students);

        // 🔹 UPDATION
        students.put(2, "Vikram"); // updates value of key 2

        System.out.println("After Updation: " + students);

        // 🔹 DELETION
        students.remove(1);

        System.out.println("After Deletion: " + students);
    }
}
