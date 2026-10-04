package t_99_exercises;

import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListExercise {
    public static void main(String[] args) {

        // Create a Scanner:
        Scanner keyboard = new Scanner(System.in);

        // Create an ArrayList:
        ArrayList<Double> charges = new ArrayList<>();

        // Create variables:
        String addingCharge;
        double currentCharge;
        double totalCharges = 0;
        
        // Prompt continuous questions:

        do {
            System.out.print("Do you want to add a charge? (Enter y/n):");
            addingCharge = keyboard.nextLine(); // Reading answer

            // Always convert to lowercase:
            addingCharge= addingCharge.toLowerCase();


            // Add a charge
            if (addingCharge.equals("y")) {

                System.out.print("Enter the amount of the charge:");

                currentCharge = keyboard.nextDouble();
                keyboard.nextLine(); // Consume Enter

                charges.add(currentCharge);
            }

        } while (addingCharge.equals("y"));


        System.out.println("\n*** TRANSACTION HISTORY: ***");

        // Print transactions:
        for (int i = 0; i < charges.size(); i++) {
            System.out.println(charges.get(i));
        }

        System.out.println("\nNumber of transactions: " + charges.size());

        // Total charges

        for (int i = 0; i < charges.size(); i++) {
            totalCharges = totalCharges + charges.get(i);
        }

        System.out.println("Total charges: " + totalCharges);
    }
}
