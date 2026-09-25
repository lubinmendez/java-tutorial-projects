package t_99_exercises;

public class GenerateEmail {
    public static void main(String[] args) {
        String fullName = "James Rudolph";
        String company = "JP Morgan Chase";

        System.out.println("*** Email Generator ***");

        // 1 Convert name and company to lower case:

        String lowerCaseName = fullName.toLowerCase();
        String lowerCaseCompany = company.toLowerCase();


        // 2 Replace blank space with a . in fullName

        String nameNoSpace = lowerCaseName.replace(" ", ".");

        // 3 Remove blank spaces in company:
        String companyNoSpace = lowerCaseCompany.replace(" ", "");

        // 3 Add .com

        String email = nameNoSpace + "@" + companyNoSpace + ".com";

        // 4 Print email:

        System.out.println(email);

    }
}
