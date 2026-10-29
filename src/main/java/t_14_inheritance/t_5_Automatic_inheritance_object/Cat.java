package t_14_inheritance.t_5_Automatic_inheritance_object;

// Every class automatically inherits from Object,
// meaning that even if you don't write anything,
// it is as if the following class said:

// public class Cat extends Object
public class Cat {
    String name;
    int age;


// toString() is usually overridden to display an object's fields (state),
// making it easier to read and debug.
// Methods represent behavior, so they are usually not included.

    @Override
    public String toString() {

        return "name: " + this.name + ", age: " + this.age + ", Memory address: " + super.toString();

    }


}

