package t_98_methods_strings;

public class Substring {
    public static void main(String[] args) {

        // Used to extract a substring from a String. You can extract one or multiple characters:`substring(start, end)` → `end` is excluded.

        String message = "Hello World";

        String substring1 = message.substring(0, 5);
        String substring2 = message.substring(6, 11);

        System.out.println("substring1 = " + substring1);;
        System.out.println("substring2 = " + substring2);


    }
}
