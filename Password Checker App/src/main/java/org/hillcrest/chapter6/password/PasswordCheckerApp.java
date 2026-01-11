package org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * PasswordApp is the main application class.
 * It prompts the user for a password, evaluates its strength,
 * and prints feedback for improvement.
 */
public class PasswordCheckerApp {

    /**
     * Main entry point of the application.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);
        String feedback = FeedbackGenerator.generateFeedback(password);

        System.out.println("\nPassword Strength: " + strength + " (" + score + "/5)");

        if (!feedback.isEmpty()) {
            System.out.println("Suggestions to improve your password:");
            System.out.print(feedback);
        }

    }
}
