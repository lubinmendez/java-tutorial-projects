package t_07_data_structures;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapLearnings {

    public static void main(String[] args) {

        // 🔹 Structure
        HashMap<Integer, String> runners = new HashMap<>();
        // You need two types because you need key-value
        // Key = runner number | Value = runner name

        // 🔹 Add
        runners.put(101, "John");
        runners.put(205, "Maria");
        runners.put(318, "Carlos");
        // Adds one key-value pair at a time

        // 🔹 Access
        System.out.println(runners.get(205));
        // Finds a value by its key, not by an index

        // 🔹 Key / Value rules
        // Keys → ❌ Duplicates not allowed
        // Values → ✅ Duplicates allowed

        // 🔹 Example
        runners.put(101, "David");
        // If the key already exists, its value is replaced

        // 🔹 Check
        System.out.println(runners.containsKey(318));
        // Checks if a key exists

        System.out.println(runners.containsValue("Carlos"));
        // Checks if a value exists

        // 🔹 Remove
        runners.remove(318);
        // Removes the entry using its key

        // 🔹 Size
        System.out.println(runners.size());
        // Number of key-value pairs
    }
}
