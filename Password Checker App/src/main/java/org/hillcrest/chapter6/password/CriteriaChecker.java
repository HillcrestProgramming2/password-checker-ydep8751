package org.hillcrest.chapter6.password;

    /**
     * class that evaluates the password based on the criteria.
     */
    public class CriteriaChecker {

        /**
         * Evaluates how many criteria the password meets.
         * @param password the password that is evaluated
         * @return number of criteria met on a scale from 0-5
         */
        public static int evaluateCriteria(String password) {
            int score = 0;

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            String specialChars = "!@#$%^&*()-+=";

            /**
             * Loop through characters to check for criteria
             * the indexof is used to find special characters and if it returns a -1 that means no special characters are included
             */

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (specialChars.indexOf(c) != -1) {
                    hasSpecial = true;
                }
            }

            if (password.length() >= 8){
                score++;
            }
            if (hasUpper){
                score++;
            }
            if (hasLower){
                score++;
            }
            if (hasDigit){
                score++;
            }
            if (hasSpecial){
                score++;
            }

            return score;
        }

        /**
         * Determines the strength based on score.
         * @param score criteria score 0-5
         * @return Weak, Moderate, or Strong
         */
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






