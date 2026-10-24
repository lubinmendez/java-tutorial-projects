package t_11_pack_a;

import t_11_pack_b.Persona;

public class EntryPoint {

    public static void main(String[] args) {

        // Create object:
        Persona person1 = new Persona();

        // Assign values:
        person1.name = "James";
        person1.age = 38;

        //Call method

        person1.sayHello();



    }
}
