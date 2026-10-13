package t_99_exercises;

import java.util.Scanner;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        // 1 Create Scanner:
        Scanner keyboard = new Scanner(System.in);

        // 2 Print message:
        System.out.println("Enter the size of the square matrix");

        // 3 Read answer:
        int size = keyboard.nextInt();

        // 4 Create 2 dimension Array
        int[][] matrix = new int[size][size];

        // 5 Create a loop to insert the values in the 2 dimension Array

        // 6 Variable sum
        int sum = 0;

        //7 Create a Loop to ask user to enter the values:
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                // 8 Print repeating message:
                System.out.println("Enter the value for position (" + i + ", " + j + ")");

                // 9 Read actual value
                int actualValue = keyboard.nextInt();

                // 10 Insert value in the actual position:
                matrix[i][j] = actualValue;

                // 11 Add values in a variable to have the total:
                if (i == j) {
                    sum = sum + matrix[i][j];
                }


            }

        }

        // 12 Print total sum:

        System.out.println("The total diagonal sum for the matrix is " + sum);

    }
}
