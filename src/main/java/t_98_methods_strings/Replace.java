package t_98_methods_strings;

public class Replace {
    public static void main(String[] args) {

        String hello = "Hello, good morning!";

        System.out.println(hello.replace(" ", ""));
        // Remove blank spaces -> Hello,goodmorning!

        System.out.println(hello.replace("o", "a"));
        // Replace all occurrences -> Hella, gaad marning!

        System.out.println(hello.replace("morning", "afternoon"));
        // Replace "morning" with "afternoon" -> Hello, good afternoon!

    }
}