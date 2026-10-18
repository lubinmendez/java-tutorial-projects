package t_10_class;

public class EntryPoint {
    public static void main(String[] args) {
        Person Person1 = new Person();
        Person1.name = "Kobe";
        Person1.lastName = "Bryant";

        Person1.sayHello();
        System.out.println("Sum: " + Aritmetic.add(5, 3));
        System.out.println("Rest: " + Aritmetic.substract(5, 3));
        System.out.println("Division: " + Aritmetic.divide(5, 3));
        System.out.println("Multiplication: " + Aritmetic.multiply(5, 3));

    }
}
