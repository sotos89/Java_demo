package gr.aueb.elearn.ch2;

/**
 * ^ Αρχή string / line
 * $ τελος string
 * \w [a-zA-Z0-9_]
 * \W [^a-zA-Z0-9_]
 */
public class RegExShorthand {
    public static void main(String[] args) {

        boolean isAnyCharSpaceDigit = "@ 0".matches(".\\s\\d");
        boolean isLetterDigit = "A9".matches("\\w\\d");
        boolean isLetterDigitAnywhere = "V99".matches(".*[a-zA-Z]\\d");
        System.out.printf("%s\n", isAnyCharSpaceDigit ? "Matches" : "Not Matches");
        System.out.printf("%s\n", isLetterDigit ? "Matches" : "Not Matches");
        System.out.printf("%s\n", isLetterDigitAnywhere ? "Matches" : "Not Matches");



    }
}
