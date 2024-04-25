package edu.sjsu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String s) {
        // Checks that a name only includes alphabetic characters, -, or single quote
        // Names must be between 2 and 40 characters long
        // Quoted strings and -- are disallowed
        String namex = "^[a-zA-Z][a-zA-Z-']{1,39}$";
        Pattern pattern = Pattern.compile(namex);
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            if (s.matches(".*'.*'.*") || s.contains("--")) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
