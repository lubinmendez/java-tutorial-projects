package t_98_methods_strings;

public class LastIndexOf {
    public static void main(String[] args) {

        String message1 = "Hello World World";

        // Index of the last "World" -> 12
        var index1 = message1.lastIndexOf("World");
        System.out.println("index1 = " + index1);

    }
}
