package t_15_dynamic_and_static_context.count_variable_static_context;

// Static context:

// Counter variable:

// when you need a variable shared by all objects.
// When you want to accumulate a value at the class level, use a static variable
// For example, to count how many objects have been created, we can place the
// increment inside the constructor so it increases every time a new object is created.

public class Person {

    public static int countPersons; // ?
    public String name;
    public String lastName;

    // Constructor
    public Person(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
        countPersons++;

    }

}
