package t_04_strings;

public class Strings {

    public static void main(String[] args) {

        // 1 When you create a variable of type String, you are actually creating an object instance, which is why you can do this:

        String name = "Pepe"; // String is a class

        System.out.println(name.length());

        /* Doing this:
        String name = "Kobe";

        It's the same as if you did:
        String name = new String("Kobe"); */

        // 2 Java knows this is a String even it is not declared in a variable:

        System.out.println("Hello".length());

        // 3 Some methods for strings:

        System.out.println("--- Some String Methods ---");

        // contains()

        String message = "This is a message";

        System.out.println("--> contains()");

        System.out.println("Does the message contains the word message? --> " + message.contains(message));

        // equals()

        String name2 = "Michael";
        String name3 ="Michael";

        System.out.println(name2 == name3); // Even though you can use == to compare t_03_strings.Strings, it can lead to unexpected results. Even if it works, it is recommended to use equals() instead of == when comparing t_03_strings.Strings

        System.out.println("--> equals()");

        System.out.println("Is your name James? --> " + name2.equals("James"));

        // trim()

        System.out.println("--> trim()");

        String removeSpaces = " Remove firs and last space ";
        // Removes white spaces at the beginning and end of a String,
        // for example, if the user accidentally leaves spaces.

        System.out.println(removeSpaces);

        System.out.println(removeSpaces.trim());

        // replace()

        System.out.println("--> replace()");

        String hello = "Hello, good morning!";

        System.out.println(hello.replace(" ", "")); // old char " ", new char "" --> Removes all whitespaces

        System.out.println(hello.replace("morning", "afternoon"));

        // String.format()

        System.out.println("--> String.format()");

        String name4 = "Ismael";
        int age = 38;

        System.out.println(String.format("Hello, I am %s and I am %d years old", name4, age));



























    }
}
