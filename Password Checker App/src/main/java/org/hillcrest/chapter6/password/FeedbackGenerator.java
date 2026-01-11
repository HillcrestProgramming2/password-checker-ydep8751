package org.hillcrest.chapter6.password;


/**
 * FeedbackGenerator creates suggestions to improve a password.
 */
public class FeedbackGenerator {

    /**
     * Generates feedback based on missing password criteria.
     *
     * @param password the password to analyze
     * @return feedback string (empty if no suggestions)
     */
    public static String generateFeedback(String password) {
        String feedback = "";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()-+=";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialChars.indexOf(c) != -1) hasSpecial = true;
        }

        if (password.length() < 8) {
            feedback += "- Increase the length to at least 8 characters.\n";
        }
        if (!hasUpper) {
            feedback += "- Add at least one uppercase letter.\n";
        }
        if (!hasLower) {
            feedback += "- Add at least one lowercase letter.\n";
        }
        if (!hasDigit) {
            feedback += "- Add at least one number.\n";
        }
        if (!hasSpecial) {
            feedback += "- Include at least one special character.\n";
        }

        return feedback;
    }
}

