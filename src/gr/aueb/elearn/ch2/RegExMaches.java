package gr.aueb.elearn.ch2;

public class RegExMaches {
    public static void main(String[] args) {
        boolean regExEqual = "Red".matches("Red");
        boolean regExRedOrGreen = "Red".matches("Red|Green}");
        boolean regExRedOrGreenFirstLetter = "green".matches("[Rr]ed|[Gg]reen");

        boolean RegExRange = "Fing".matches("[A-Z]ing");


        System.out.printf("%s\n", RegExRange ? "Matches" : "Not Matches");
        System.out.printf("%s\n", regExRedOrGreenFirstLetter ? "Matches" : "Not Matches");
        System.out.printf("%s\n", regExRedOrGreen ? "Matches" : "Not Matches");
        System.out.printf("%s\n", regExEqual ? "Matches" : "Not Matches");
    }
}
