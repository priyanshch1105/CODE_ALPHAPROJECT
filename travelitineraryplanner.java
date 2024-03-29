package java_practice;

import java.util.Scanner;

public class travelitineraryplanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Travel Itinerary Planner!");

        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter the start date of your travel (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter the end date of your travel (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        System.out.print("Enter the accommodation cost per night: ");
        double accommodationCostPerNight = scanner.nextDouble();

        System.out.print("Enter your estimated daily expenses: ");
        double dailyExpenses = scanner.nextDouble();

        String weatherForecast = getWeatherForecast(destination, startDate);
        double budget = calculateBudget(startDate, endDate, accommodationCostPerNight, dailyExpenses);

        System.out.println("\n--- Your Travel Itinerary ---");
        System.out.println("Destination: " + destination);
        System.out.println("Travel Dates: " + startDate + " to " + endDate);
        System.out.println("Weather Forecast: " + weatherForecast);
        System.out.printf("Estimated Budget: $%.2f%n", budget);

        scanner.close();
    }

    public static String getWeatherForecast(String destination, String date) {
        // Use a weather API to get the forecast for the destination on the given date
        // You can implement this part using your preferred weather API library or HTTP client
        // For simplicity, returning a dummy forecast here
        return "Sunny";
    }

    public static double calculateBudget(String startDate, String endDate, double accommodationCostPerNight, double dailyExpenses) {
        // Calculate total budget based on travel dates, accommodation cost, and daily expenses
        // For simplicity, assuming a fixed number of days between start and end date
        int numDays = calculateDays(startDate, endDate);
        double totalAccommodationCost = numDays * accommodationCostPerNight;
        double totalDailyExpenses = numDays * dailyExpenses;
        return totalAccommodationCost + totalDailyExpenses;
    }

    public static int calculateDays(String startDate, String endDate) {
        // Implement a method to calculate the number of days between two dates
        // You can use Java's Date/Time API or external libraries like Joda-Time for this
        // For simplicity, returning a fixed number of days here
        return 5;
    }
}