import java.util.TreeMap;

public class sortedmap {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // 🔹 INSERTION
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println("After Insertion: " + map);

        // 🔹 UPDATION
        map.put(2, "Z"); // update value

        System.out.println("After Updation: " + map);

        // 🔹 DELETION
        map.remove(1);

        System.out.println("After Deletion: " + map);
    }
}
