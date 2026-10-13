package t_07_data_structures;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // [Row][column]
        int[][] matrix = new int[3][5];

        // Row 0
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[0][4] = 5;

        // Row 1
        matrix[1][0] = 6;
        matrix[1][1] = 7;
        matrix[1][2] = 8;
        matrix[1][3] = 9;
        matrix[1][4] = 10;

        // Row 2
        matrix[2][0] = 11;
        matrix[2][1] = 12;
        matrix[2][2] = 13;
        matrix[2][3] = 14;
        matrix[2][4] = 15;

        // Visually is like a table:

//        COLUMN
//        0   1   2   3   4
//        +---+---+---+---+---+
//ROW  0  | 1 | 2 | 3 | 4 | 5 |
//        +---+---+---+---+---+
//     1  | 6 | 7 | 8 | 9 | 10|
//        +---+---+---+---+---+
//     2  |11 |12 |13 |14 |15 |
//        +---+---+---+---+---+

        // Print values
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.println(matrix[i][j]);
            }
        }



    }
}
