package t_14_inheritance.t_4_polymorphism;

public class EntryPoint {

    public static void main(String[] args) {

        // Polymorphism:
        // The ability of different objects to respond differently to the same method.
        //For polymorphism, you need:
        // + Inheritance
        // + Method Overriding (@Override)
        // + a parent-type reference pointing to a child object, example: Animal perro1 = new Perro();


        // We already apply Inheritance and override in the childs
        // and here we are using parents type:

        Cellphone vector[] = new Cellphone[2];
        // Use the parent type to store different child objects in the same array.

        vector[0] = new AndroidPhone();
        vector[1] = new Iphone();

        // This allows us to have different types in an Array that only accepts 1 type



    }
}
