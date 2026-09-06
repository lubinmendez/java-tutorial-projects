package t_07_data_structures;

import java.util.ArrayList;

public class ArrayListLearnings {

    public static void main(String[] args) {

// 🔹 Limitations of regular arrays:
//
// - You cannot change the size once it has been established.
// - You cannot directly remove a specific element.

// 🔹 ArrayLists are more dynamic and allow you to:
//
// - Add elements
// - Remove elements
// - Modify elements

// ArrayList cannot use primitive types such as int, double, char, etc.
// It requires the corresponding wrapper class instead.

// Primitive type --> Wrapper class

// int      --> Integer
// long     --> Long
// double   --> Double
// char     --> Character
// boolean  --> Boolean

// String is already a class, so it does not have a wrapper class.

//🔹 Structure

    ArrayList<String> names = new ArrayList<String>();

//🔹 Assign / Add

    names.add("John");
    names.add("James");

//🔹 Access

// names.get(0);
    System.out.println(names.get(0));
    System.out.println(names.get(1));

//🔹 Modify

    names.set(1, "kobe");
// To verify the modification:
//    System.out.println("New name in position 1: " + names.get(1));

//🔹 Remove

 names.remove(1);
// To verify remove:
//    System.out.println(names.size());

// 🔹 You can also declare an ArrayList using var:
//
// var names = new ArrayList<String>();

    }
}
