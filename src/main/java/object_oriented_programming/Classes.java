package object_oriented_programming;

public class Classes {

    public static void main(String[] args) {

        var Person1 = new Person();


        Person1.name = "Kobe";
        Person1.age = 38;

        // The values are stored in the object's fields, not passed as arguments.

        // The difference is that fields are always part of the object,
        // while arguments are only passed to the method when it is called.
        Person1.sayHello();
    }
}
