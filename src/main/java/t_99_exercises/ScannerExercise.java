package t_99_exercises;

import java.util.Scanner; // Import Scanner

public class ScannerExercise {
    public static void main(String[] args) {

        // 1 create Scanner
        Scanner keyboard = new Scanner(System.in);

        // 2 Print out to simulate a conversation
        System.out.println("Enter your age:");

        // 3 Read input:
        var age = keyboard.nextInt();

        // Verify:
        System.out.println("age = " + age);
    }
}
