package org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * Ask for user input
 * takes in the password and evaluates the strength.
 * prints feedback for improving the password.
 */
public class PasswordCheckerApp {
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
