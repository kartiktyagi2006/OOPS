import java.util.TreeSet;

public class sortedset {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // 🔹 INSERTION
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println("After Insertion: " + numbers);

        // 🔹 UPDATION (Remove + Add)
        numbers.remove(30);
        numbers.add(40);

        System.out.println("After Updation: " + numbers);

        // 🔹 DELETION
        numbers.remove(10);

        System.out.println("After Deletion: " + numbers);
    }
}
