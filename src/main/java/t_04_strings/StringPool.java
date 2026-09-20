package t_04_strings;

public class StringPool {

    public static void main(String[] args) {
        // String literals are stored in the String Pool.
        // Equal literals can reuse the same object and reference.
        var name1 = "James";
        var name2 = "James";
        var name3 = new String("James");

        // == compares references, not String content.
        System.out.println("name1 and name2 have the same reference:");
        System.out.println(name1 == name2);

        // Different references whe we use the keyword new to create objects:
        System.out.println("name1 and name3 have the same reference:");
        System.out.println(name1 == name3);

        // equals() is used to truly compare content, not references.
        System.out.println("name1 and name3 have the same content:");
        System.out.println(name1.equals(name3));

    }
}
