package conditionals;

public class Switch {

    public static void main(String[] args) {

        int day = 5;

        System.out.println("==================================================");
        System.out.println("Without the keyword break: ❌");

// This is the reason why we need the keyword break, because if we don't use it, Java will continue executing all the following cases after finding a match:
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }

        System.out.println("The result should be Friday, but without break, it will continue executing after a match. ❌");

        System.out.println("==================================================");
        System.out.println("Using break: ✅");

        switch (day) {
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
    }
}
