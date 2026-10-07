package t_99_exercises;

public class printArray {
    public static void main(String[] args) {

        int[] myArray = new int[5];

        myArray[0] = 3;
        myArray[1] = 6;
        myArray[2] = 9;
        myArray[3] = 12;
        myArray[4] = 15;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


    }
}
