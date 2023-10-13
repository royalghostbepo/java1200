import java.text.DecimalFormat;

public class javaice2_joseph {


    /**
     * Draws stars based on the given count.
     * @param count The number of stars to draw.
     */
    public static void drawStars(int j) {
        for (int i = 0; i < j; i++) {
            System.out.print("*");
        }
        System.out.println(); // Newline after stars
    }

    /**
     * Prints a statement.
     * @param statement The statement to be printed.
     */
    public static void printStatement(String statement) {
        System.out.println(statement);                      // The statement will be in later lines of code
    }

    /**
     * Multiplies two integers and returns the result.
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The product of num1 and num2.
     */
    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Multiplies two decimal numbers and returns the result.
     * @param num1 The first decimal number.
     * @param num2 The second decimal number.
     * @return The product of num1 and num2.
     */
    public static double multiplyNumbers(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Checks if a string is a palindrome.
     * @param str The string to check for palindrome.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        // Remove non-alphabetic characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();     // Got help with this line.
        int length = str.length();
        if (length <= 1) {
            return true; // Base case: A single character or an empty string is a palindrome
        } else if (str.charAt(0) == str.charAt(length - 1)) {
            // If the first and last characters match, check the rest of the string
            return isPalindrome(str.substring(1, length - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        drawStars(15);
        printStatement("ICE2: Function Practice Start");    // Print start statement
        int intResult = multiplyNumbers(5, 7);              // Should be 35
        System.out.println("Multiplying integers: " + intResult);
        double doubleResult = multiplyNumbers(3.5, 2.7);   // Should be 9.45
        // Create a DecimalFormat object with the desired format
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        // Format the doubleResult to display with two decimal places
        String formattedResult = decimalFormat.format(doubleResult);

        System.out.println("Multiplying decimals: " + formattedResult);
        printStatement("ICE2: Function Practice End");      // Print end statement
        drawStars(15);

        // Test isPalindrome
        System.out.println("Is 'civic' a palindrome? " + isPalindrome("civic")); // Should be true
        System.out.println("Is 'COSC1200' a palindrome? " + isPalindrome("COSC1200")); // Should be false
    }
}
