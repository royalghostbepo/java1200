public class JAVAICE1joseph {
    public static void main(String[] args) {
        // Displaying a welcome message with name and banner id
        System.out.println("Welcome! My name is Joseph Bepo and my banner id is 100901775.");

        // Displaying a favorite quote with its source
        System.out.println("One of my favorite quotes is: Work hard and in silence... (The Art of War by Sun Tzu )");

        // Asking the user for decimal numeric input
        System.out.print("Please enter a decimal numeric value: ");
        double userInput = Double.parseDouble(System.console().readLine());

        // Evaluating if the user input is within acceptable boundaries
        if (userInput >= 50 && userInput <= 999) {
            System.out.println("The number you entered is " + userInput + " and it is within acceptable boundaries (50 and 999).");
        } else {
            System.out.println("Alert, the number you entered is " + userInput + " and it is outside acceptable boundaries (50 and 999).");
        }
    }
}
