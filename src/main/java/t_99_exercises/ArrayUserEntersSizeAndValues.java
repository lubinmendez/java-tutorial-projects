package t_99_exercises;

import java.util.Scanner;

public class ArrayUserEntersSizeAndValues {
    public static void main(String[] args) {

        // Create Scanner
        Scanner keyboard = new Scanner(System.in);

        // Print message:
        System.out.println("Enter the size of the Array:");

        // Read answer:
        int arraySize = keyboard.nextInt();

        // Create Array inserting the size that the user inputs

        int[] myArray = new int[arraySize];

        // Create a loop that ask the user to input the values of the Array"
        for (int i = 0; i < arraySize; i++) {

            System.out.println("Enter the value for th Array no. " + (i + 1));

            myArray[i] = keyboard.nextInt();
        }

        // Print the values of the Array

        System.out.println("\n*** The values that you enter are: ***");

        for (int i = 0; i < arraySize; i++) {
            System.out.println(myArray[i]);
        }


    }
}
