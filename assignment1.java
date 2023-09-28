

import java.util.Scanner;

public class assignment1 {  // Open public class named same as the file name "assignment1"
    public static void main(String[] args) {  
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Constants for acceleration due to gravity (in m/s^2)
        final double GRAVITY = 9.8;

        // Prompt the user for input
        System.out.print("Enter the initial angle of the projectile in degrees: ");
        double launchAngleDegrees = Math.abs(scanner.nextDouble()); // Use absolute value

        System.out.print("Enter the initial velocity of the projectile: ");
        double initialVelocity = Math.abs(scanner.nextDouble()); // Use absolute value

        // Convert launch angle from degrees to radians
        double launchAngleRadians = Math.toRadians(launchAngleDegrees);

        // Calculate the time of flight (total time the projectile is in the air)
        double timeOfFlight = (2 * initialVelocity * Math.sin(launchAngleRadians)) / GRAVITY;

        // Calculate the maximum horizontal distance
        double maxDistance = (initialVelocity * initialVelocity * Math.sin(2 * launchAngleRadians)) / GRAVITY;

        // Calculate the maximum height
        double maxHeight = (initialVelocity * initialVelocity * Math.sin(launchAngleRadians) * Math.sin(launchAngleRadians)) / (2 * GRAVITY);

        // Display the results with meaningful messages
        System.out.printf("Time of flight: %.3f seconds%n", timeOfFlight);
        System.out.printf("Maximum horizontal distance: %.3f meters%n", maxDistance);
        System.out.printf("Maximum height: %.3f meters%n", maxHeight);

        // Close the Scanner
        scanner.close();
    }
}
