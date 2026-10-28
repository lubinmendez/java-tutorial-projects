package t_14_inheritance.basic_inheritance;

// Inheritance:
// In the main method, once the object is created,
// we can call the methods defined in the parent class.

public class EntryPoint {
    public static void main(String[] args) {

        DogChild dogChild1 = new DogChild();
        // Parent method (inheritance)
        dogChild1.sleep();
        dogChild1.eat();
        // Child method
        dogChild1.bark();
    }
}
