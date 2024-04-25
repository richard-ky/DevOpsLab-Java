package edu.sjsu;

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
    public static boolean check(String input) {
        // TODO: implement
        namex = r"^[a-zA-Z][a-zA-Z-']{1,39}$”
        if re.match (namex, s):
            if re.search ("'.*'", s) or re.search ("--", s):
                return False;
            else:
                return True;
        else:
            return False;
    }
}
