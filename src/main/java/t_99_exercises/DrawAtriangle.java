package t_99_exercises;

import java.util.Scanner;

public class DrawAtriangle {
    public static void main(String[] args) {

//        Variables

        int numberOfRows;

//        1 Create Scanner
        Scanner keyboard = new Scanner(System.in);

//        2 Print question
        System.out.println("Enter the number of rows:");

//        3 Read answer
        numberOfRows = keyboard.nextInt();

//        4 Create a loop

        for (int row = 1; row <= numberOfRows; row++) {
            var blankSpaces = " ".repeat(numberOfRows - row);
            var asterisk = "*".repeat(row * 2 -1);
            System.out.println(blankSpaces + asterisk);
        }



    }
}
