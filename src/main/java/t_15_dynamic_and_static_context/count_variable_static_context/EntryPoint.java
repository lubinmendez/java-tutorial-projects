package t_15_dynamic_and_static_context.count_variable_static_context;

public class EntryPoint {
    public static void main(String[] args) {

        Person person1 = new Person("Jimmy", "Potter");

        Person person2 = new Person("Kobe", "Bryant");

        System.out.println("Number of Person objects created: " + Person.countPersons);
    }
}
