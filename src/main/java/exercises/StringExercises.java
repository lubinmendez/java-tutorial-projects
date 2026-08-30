package exercises;

public class StringExercises {

    public static void main(String[] args) {

    // 1- Concatenate two strings.
        System.out.println("==================================================");
        System.out.println("1- Concatenate two strings:");

        String exerciseOne1 = "Hello ";
        String exerciseOne2 = "world";

        System.out.println(exerciseOne1 + exerciseOne2);

    // 2- Show the length of a string.
        System.out.println("==================================================");
        System.out.println("2- Show the length of a string:");

        String exerciseTwo = "Java";

        System.out.println(exerciseTwo.length());

    // 3- Show the first and last character of a string.
        System.out.println("==================================================");
        System.out.println("3- Show the first and last character of a string:");

        String exerciseThree = "Goku";

        System.out.println(exerciseThree.charAt(0));
        System.out.println(exerciseThree.charAt(exerciseThree.length()-1));

    // 4- Convert a string to uppercase.
        System.out.println("==================================================");
        System.out.println("4- Convert a string to uppercase:");

        String exerciseFour = "convert to lower case";

        System.out.println(exerciseFour.toUpperCase());

    // 5- Check if a string contains a word.
        System.out.println("==================================================");
        System.out.println("5- Check if a string contains a word:");

        String exerciseFive = "This is a message";

        System.out.println(exerciseFive.contains("message")); // True

    // 6- Format a string with an integer.
        System.out.println("==================================================");
        System.out.println("6- Format a string with an integer:");

        int exerciseSix = 38;

        System.out.println(String.format("My age is %d", exerciseSix));

    // 7- Show first and last letter of a string
        System.out.println("==================================================");
        System.out.println("7- Show first and last letter of a string:");

        String exerciseSeven = "aeiou";

        System.out.println(exerciseSeven.substring(0, 1)); // a
        System.out.println(exerciseSeven.substring(exerciseSeven.length() - 1)); // u

    // 8- Remove white spaces at the beginning and end.
        System.out.println("==================================================");
        System.out.println("8- Remove white spaces at the beginning and end:");

        String exerciseEight = " Message ";

        System.out.println(exerciseEight);
        System.out.println(exerciseEight.trim());

    // 9- Replace all white spaces in a string.
        System.out.println("==================================================");
        System.out.println("9- Replace all white spaces in a string:");

        String exerciseNine = " Hello world";

        System.out.println(exerciseNine.replace(" ", ""));


    // 10- Check if two strings are equal.
        System.out.println("==================================================");
        System.out.println("10- Check if two strings are equal:");

        String exerciseTen1 = "Kobe";
        String exerciseTen2 = "KoBe";

        System.out.println(exerciseTen2.equals(exerciseTen1)); // False

    // 11- Check if two strings have the same length.
        System.out.println("==================================================");
        System.out.println("11- Check if two strings have the same length:");

        String exerciseEleven1 = "funny";
        String exerciseEleven2 = "bunny";

        System.out.println(exerciseEleven1.length() == exerciseEleven2.length());

    }
}
