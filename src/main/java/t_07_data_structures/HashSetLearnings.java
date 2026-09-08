package t_07_data_structures;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetLearnings {

    public static void main(String[] args) {

    // 🔹 Structure
        HashSet<String> names = new HashSet<>();

    // 🔹 add() → Adds an element to the HashSet
        names.add("John");
        names.add("Maria");
        names.add("Carlos");

    // HashSet does not allow duplicate elements
        names.add("John"); // This will NOT add another "John"

        System.out.println(names);

    // 🔹 contains() → Checks if an element exists
        System.out.println(names.contains("Maria")); // true
        System.out.println(names.contains("David")); // false


        // size() → Returns the number of elements
        System.out.println(names.size());

    //  🔹remove() → Removes a specific element
        names.remove("Carlos"); // Instead of indicating the index like [1] you enter the value example Carlos

        System.out.println(names);

    //  🔹 clear() → Removes all elements
        names.clear();

        System.out.println(names); // []

    }

}
