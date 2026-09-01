package exercises;

public class ConditionalsExercises {

    public static void main(String[] args) {
// 1. Set a user's age and display whether they can vote (18 or older)
        System.out.println("==================================================");
        System.out.println("1. Set a user's age and display whether they can vote (18 or older)");

        int exerciseOne = 18;

        if (exerciseOne < 18) {
            System.out.println("You are a minor, you can not vote");
        } else if (exerciseOne == 18) {
            System.out.println("Congratulations you are now 18, you can vote!");
        } else {
            System.out.println("You are of legal age, you can vote!");
        }

// 2. Declare two numbers and display which one is greater, or if they are equal.
        System.out.println("==================================================");
        System.out.println("2. Declare two numbers and display which one is greater, or if they are equal.");

        int exerciseTwo1 = 10;
        int exerciseTwo2 = 10;

        if (exerciseTwo1 > exerciseTwo2) {
            System.out.println("First value is greater");
        } else if (exerciseTwo1 == exerciseTwo2) {
            System.out.println("Booth values are equal.");
        } else {
            System.out.println("Second value is greater.");
        }

// 3. Given a number, check whether it is positive, negative, or zero.
        System.out.println("==================================================");
        System.out.println("3. Given a number, check whether it is positive, negative, or zero.");

        int exerciseThree = 1;

        if (exerciseThree < 0) {
            System.out.println("The number is negative");

        } else if (exerciseThree == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

// 4. Create a program that determines whether a number is even or odd.
        System.out.println("==================================================");
        System.out.println("4. Create a program that determines whether a number is even or odd.");

        int exerciseFour = 4;

        if (exerciseFour % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

// 5. Check whether a number is in the range from 1 to 100.
        System.out.println("==================================================");
        System.out.println("5. Check whether a number is in the range from 1 to 100.");

        int exerciseFive = 0;

        if (exerciseFive >= 1 && exerciseFive <= 100) {
            System.out.println("The number is in the range from 1 to 100.");
        } else  {
            System.out.println("The number is not in the range from 1 to 100.");
        }

// 6. Declare a variable with the day of the week (1-7) and display the day using a switch.
        System.out.println("==================================================");
        System.out.println("6. Declare a variable with the day of the week (1-7) and display the day using a switch.");

        int exerciseSix = 4;

        switch (exerciseSix) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // Default is like an else
                System.out.println("Invalid day");
        }

// 7. Simulate a grading system: display "Outstanding", "Pass", or "Fail" depending on the grade from 0 to 100.
        System.out.println("==================================================");
        System.out.println("7. Simulate a grading system: display Outstanding, Pass, or Fail depending on the grade from 0 to 100.");

        int exerciseSeven = 96;

        // 0-59 Fail
        if (exerciseSeven >= 0 && exerciseSeven <= 59) {
            System.out.println("Fail");
        }
        // 60–89 Pass
        else if (exerciseSeven >= 60 && exerciseSeven <= 89) {
            System.out.println("Pass");
        }
        // 90–100 Outstanding
        else if (exerciseSeven >= 90 && exerciseSeven <= 100) {
            System.out.println("Outstanding");
        }
        // Invalid number
        else {
            System.out.println("Invalid number");
        }

// 8. Write a program that determines whether you can enter the movie theater: you must be at least 15 years old or be accompanied.
        System.out.println("==================================================");
        System.out.println("8. Write a program that determines whether you can enter the movie theater: you must be at least 15 years old or be accompanied.");

        int exerciseEightAge = 15;
        boolean exerciseEightAccompanied = false;

        if (exerciseEightAge >= 15 || exerciseEightAccompanied == true) {
            System.out.println("You can enter the movie theater");
        } else {
            System.out.println("You can not enter the movie theater");
        }

// 9. Create a program that determines whether a letter is a vowel or a consonant (char).
        System.out.println("==================================================");
        System.out.println("9. Create a program that determines whether a letter is a vowel or a consonant (char).");

        char exerciseNineLetter = 's';

        // char is a primitive type, not an object, so it does not have methods like equals(), which can be used with Strings.

        if (exerciseNineLetter == 'a' ||
            exerciseNineLetter == 'e' ||
            exerciseNineLetter == 'i' ||
            exerciseNineLetter == 'o' ||
            exerciseNineLetter == 'u'
            ) {
            System.out.println("letter is a vowel");
        } else {
            System.out.println("letter is a consonant");
        }

// 10. Use three variables, a, b, and c, with no equal values, and determine which one is the greatest.
        System.out.println("==================================================");
        System.out.println("10. Use three variables, a, b, and c, and determine which one is the greatest.");

        int a = 1;
        int b = 2;
        int c = 3;

        // a is greater
        if (a > b && a > c) {
            System.out.println("Variable a is the greatest");
        }
        // b is greater
        else if (b > a && b > c) {
            System.out.println("Variable b is the greatest");
        }
        // c is greater
        else if (c > a && c > b) {
            System.out.println("Variable c is the greatest");
        }


    }


}
