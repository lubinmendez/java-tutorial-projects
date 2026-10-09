package t_99_exercises;

import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        double total = 0;


        // Create Scanner
        Scanner keyboard = new Scanner(System.in);

        // Print message:
        System.out.println("Enter the number of grades:");

        // Read answer:
        int numberOfGrades = keyboard.nextInt();

        // Create Array inserting the size that the user inputs

        int[] grades = new int[numberOfGrades];

        // Create a loop that ask the user to input grades:"
        for (int i = 0; i < numberOfGrades; i++) {

            System.out.println("In number between 0-10, Enter Grade no. " + (i + 1));

            grades[i] = keyboard.nextInt();
        }

        // Print Grades (values of the Array)

        System.out.println("\n**************************");

        for (int i = 0; i < numberOfGrades ; i++) {
            total = total + grades[i];
        }

        double average = total / numberOfGrades;

        System.out.println("The average for the grades is: " + average);


    }

}
