import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays;

        // Request user input (range 1-31)

        do{
            System.out.println("Enter the number of days in the month(1-31): ");
            totalDays = scanner.nextInt();
            if (totalDays < 1 || totalDays > 31) {
                System.out.println("Invalid entry, please enter a valid day between 1 and 31.");
                }
                }while (totalDays < 1 || totalDays > 31);

                double[] lowTemperatures = new double[totalDays];
                double[] highTemperatures = new double[totalDays];

                double overallLowest = Double.MAX_VALUE;
                double overallHighest = 0;
                double overallSum =0; 

                for ( int day = 0; day < totalDays; day++) {
                    System.out.print("Enter temperature on Day " + (day+1)+": ");
                    double low, high;

                    //Getting user input for low temperature

                    do {
                        System.out.println("Enter the low temperature (-30 to 30) :");
                        low = scanner.nextDouble();
                        if (low< -30 || low> 30){
                            System.out.println("Invalid Entry! Please Enter Temperature Between -30 and 30!");
                        }
                    }while (low < -30 || low > 30);

                    // get the high temperature
                    do {
                        System.out.println("Enter the high temperature (-30 to 30) :");
                        high = scanner.nextDouble();
                        if (high< -30 || high> 30 || high < low){
                            System.out.println("Invalid input Please enter a temperature between -30 and 30, not lower than the low temperature");
                            }
                    } while (high < - 30 || high > 30 || high < low);
                    // calculate average daily temperatures

                    lowTemperatures[day] = low;
                    highTemperatures[day] = high;

                    double average = (low + high) / 2;
                    overallLowest = Math.min(overallLowest, average);
                    overallHighest = Math.max(overallHighest, average);
                    overallSum += average;

                    System.out.printf("Average temperature for day %d: %.1fC%n", day + 1, average);
                    }// end of loop over all days

                    double overallAverage = overallSum / totalDays;
                    System.out.printf("Overall Average Temperature: %.1f°C%n", overallAverage);
                    System.out.printf("Day with Lowest Temperature: %.1f°C%n", overallLowest);
                    System.out.printf("Day with Highest Temperature: %.1f°C%n", overallHighest);

                    scanner.close();
                }
            
        



    }