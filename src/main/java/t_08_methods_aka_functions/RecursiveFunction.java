package t_08_methods_aka_functions;

public class RecursiveFunction {

    public static void main(String[] args) {
        recursive(5);
    }

    static void recursive(int number) {

        // Base case
        if (number == 1) {
            System.out.println(number);
        }
        else {
            System.out.println(number);
            recursive(number-1);
        }





    }
}
