package t_07_data_structures;

public class Arrays {
    public static void main(String[] args) {

    // 🔹 1 Short syntax:

        int[] numbers = {3, 5, 7};

        // [] indicates that is an array
        // { } An array is actually an object, which is why its values goes inside curly brackets { }. However, even though an array is an object, that is not the reason for this. As a memory trick, this explanation can help you remember the syntax.

    // 🔹 2 Long syntax:
        int[] numbers2 = new int[5];

        numbers2[0] = 10;
        numbers2[1] = 23;
        numbers2[2] = 14;
        numbers2[3] = 80;
        numbers2[4] = 7;

        // When is the long syntax used?
        // When the values or the size will be entered or determined later, or dynamically, for example, through a loop or by user input.

        // 👉 Access to values:
        System.out.println(numbers[0]);
        System.out.println(numbers2[3]);

        // [0] --> Indicates the position you want to access



    }
}
