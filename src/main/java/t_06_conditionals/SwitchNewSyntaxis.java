package t_06_conditionals;

public class SwitchNewSyntaxis {
    public static void main(String[] args) {

        int day = 3;

        var result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(result);


    }
}
