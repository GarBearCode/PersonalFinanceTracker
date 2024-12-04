import java.util.Scanner;

/**
 * Personal Finance Tracker
 * Created: 12/03/2024
 * Author: Your Name
 * 
 * Tracks your income, expenses, and savings.
 * Simple way to manage money.
 */

public class PersonalFinanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalIncome = 0, totalExpenses = 0; // Track totals
        boolean exit = false;

        System.out.println("Welcome to the Finance Tracker!");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Pick an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add income
                    System.out.print("Enter income amount: ");
                    totalIncome += scanner.nextDouble();
                    System.out.println("Income added.");
                    break;
                case 2:
                    // Add expense
                    System.out.print("Enter expense amount: ");
                    totalExpenses += scanner.nextDouble();
                    System.out.println("Expense added.");
                    break;
                case 3:
                    // Show summary
                    System.out.println("Total Income: $" + totalIncome);
                    System.out.println("Total Expenses: $" + totalExpenses);
                    System.out.println("Savings: $" + (totalIncome - totalExpenses));
                    break;
                case 4:
                    // Exit program
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
