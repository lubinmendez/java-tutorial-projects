package t_98_methods_strings;

public class IndexOf {
    public static void main(String[] args) {

        String message1 = "Hello World World";

        // Index of the first "World" -> 6
        var index1 = message1.indexOf("World");
        System.out.println("index1 = " + index1);

        // Not found -> -1
        var index2 = message1.indexOf("Java");
        System.out.println("index2 = " + index2);

        // Returns the index of the first occurrence.
    }
}