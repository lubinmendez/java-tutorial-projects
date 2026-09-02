package t_06_conditionals;

public class IfElseElseif {
    public static void main(String[] args) {

        int age = 19;

        if (age > 18) {
            System.out.println("The user is of legal age");
        }
        else if (age == 18) {
            System.out.println("The user just turned 18");
        }
        else {
            System.out.println("The user is a minor");
        }
    }
}
