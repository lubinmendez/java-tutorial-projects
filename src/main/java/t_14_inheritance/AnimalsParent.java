package t_14_inheritance;

//Inheritance:
// Is having methods in the parent class and writing extends ParentClassName in the child class.
// This allows the child class to use methods defined in the parent class.

public class AnimalsParent {
    protected void eat() {
        System.out.println("Eating...");
    }

    protected void sleep() {
        System.out.println("Sleeping...");
    }
}
