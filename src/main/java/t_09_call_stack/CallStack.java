package t_09_call_stack;

public class CallStack {
    public static void main(String[] args) {
        callStack(5);
    }

    /* Imagine a recursive method that calls itself **before printing the current value**. The print statement remains pending until the recursive call finishes.

    Once the base case is reached, the method calls return one by one, executing the pending instructions in reverse order, from the last call to the first.

    This is known as **LIFO (Last In, First Out)**. The call stack works like a stack of plates: you place one plate on top of another, and the last plate placed is the first one removed.

**Example:** Calls go down from 5 to 1, but the numbers print from 1 to 5.*/

    static void callStack(int number) {

        // Base case
        if (number == 1) {
            System.out.println(number);
        }
        else {
            callStack(number-1);
            System.out.println(number);
        }

    }
}
