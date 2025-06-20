package Java.control_statements_string_math.challenge;

import java.util.Scanner;

public class Challenge {

    // Create a program to find the minimum of two numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println(" Enter symbol perform basic arithmetic operations like +, -, *, and /.");
        String symbol = input.next();

        Challenge min = new Challenge();

        // ************** find the minimum of two numbers
        // int minnumber = min.findMinimum(num1, num2);
        // System.out.println("Minimum number is: " + minnumber);
        // ************** find if the given number is even or odd
        // String evenOdd = min.oddEven(num1);
        // System.out.println("Number is : " + evenOdd);
        // ************** calculate the absolute value of a given integer
        // int absolute = num1 >= 0 ? num1 : -num1;
        // System.out.println("Absolute Number is: " + absolute);
        // ************** Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator 
        // String score = num1 >= 80 ? "High" : num1 >= 50 ? "Moderate" : "Low";
        // System.out.println(score);
        // ************** print the month of the year based on a number (1-12) input by the user.
        // String month = min.getMonthName(num1);
        // System.out.println(month);
        // ************** create a simple calculator that uses a switch statement
        int result = min.calculator(num1, num2, symbol);
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
    }

    public int findMinimum(int num1, int num2) {
        int minimum = num1 > num2 ? num2 : num1;
        return minimum;
    }

    public String oddEven(int num1) {
        String number = num1 % 2 == 0 ? "even" : "odd";
        return number;
    }

    public static String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 ->
                "January";
            case 2 ->
                "February";
            case 3 ->
                "March";
            case 4 ->
                "April";
            case 5 ->
                "May";
            case 6 ->
                "June";
            case 7 ->
                "July";
            case 8 ->
                "August";
            case 9 ->
                "September";
            case 10 ->
                "October";
            case 11 ->
                "November";
            case 12 ->
                "December";
            default ->
                "Mars Month";
        };
    }

    public static int calculator(int num1, int num2, String symbol) {
        return switch (symbol) {
            case "+" ->
                num1 + num2;
            case "-" ->
                num1 - num2;
            case "*" ->
                num1 * num2;
            case "/" ->
                num1 / num2;
            default ->
                -1;
        };
    }
}
