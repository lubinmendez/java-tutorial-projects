package t_98_methods_strings;

public class Length {
    public static void main(String[] args) {

        // Remember that in JavaScript, `length` is a property, but in Java it can be a method (in a `String`) or a field (in an array).

        // Although `length` is a property in JavaScript, in Java it is a method for `String`, even though length is conceptually a characteristic (property/field). This is simply how the `String` class was designed in Java: `length()` is a method.

        String name = "Panfilo";

        System.out.println("*** Number of characters in the word Panfilo: ***");
        System.out.println(name.length()); // 7

        // ======= length in an Array =======

        int[] myArray = {3, 6, 9};

        System.out.println("*** length of my array: ***");

        System.out.println(myArray.length);

        // ======= String vs Array =======
        System.out.println("*** String -> length() | Array -> length ***");
        String text = "Hello";
        int[] numbers = {10, 20, 30};

        System.out.println(text.length());  // String → method
        System.out.println(numbers.length); // Array → property
    }
}



