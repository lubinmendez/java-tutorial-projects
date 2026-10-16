package t_08_methods_aka_functions;

public class MethodsAkaFunctions {

    public static void main(String[] args) {

        printMessage("Hello from the main method");

        System.out.println(myMethod());

        System.out.println(sum(4, 5));

        // Exercise
        System.out.println("5 is even number: " + evenNumber(5));

    }

    // Method without return (void)
    static void printMessage(String message) {
        System.out.println(message);
    }

    // Method with return
    static String myMethod() {
        return "Method with return";
    }

    // Method with return and parameters
    static int sum(int a, int b) {

        int result = a + b;
        return result;
    }

    // Exercise "Even number"
    static boolean evenNumber(int number) {

        if (number % 2 == 0 ) {

            return true;
        } else {
            return false;
        }




    }


}
