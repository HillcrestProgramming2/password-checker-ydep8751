package org.hillcrest.chapter6.password;

public class CriteriaChecker{


    // Evaluates password and returns how many criteria (0–5) it meets
    public static int evaluateCriteria(String password) {
        int score = 0;

        // Criterion 1: At least 8 characters
        if (password.length() >= 8) {
            score++;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Allowed special characters
        String specialChars = "!@#$%^&*()-+=";

        // Loop through characters
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else
            {
                // Check special characters using a loop
                for (int j = 0; j < specialChars.length(); j++) {
                    if (ch == specialChars.charAt(j)) {
                        hasSpecial = true;
                        break;
                    }
                }
            }
        }

        // Add points for each criterion met
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        return score;
    }

    // Returns strength label based on score
    public static String determineStrength(int score) {
        if (score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}




