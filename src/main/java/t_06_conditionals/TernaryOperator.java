package t_06_conditionals;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 17;
        var decision = (age >= 18) ? "The user is of legal age" : "The user is a minor";
        System.out.println(decision);
    }
}
