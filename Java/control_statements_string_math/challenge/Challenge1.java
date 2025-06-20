package Java.control_statements_string_math.challenge;

// import java.util.Random;
import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Welcome to set password\n");
        //     String password;
        //     do {
        //         System.out.println("Please enter your password: ");
        //         password = input.next();
        //     } while (!isValidPassword(password));
        //     System.out.println("Thanks for entering a valid password");

        isGame();
    }

    // Create a program using do-while to find password checker until a valid password is entered.
    // public static boolean isValidPassword(String password) {
    //     return password.length() > 6;
    // }
    // Create a program using do-while to implement a number guessing game.
    public static void isGame() {
        Scanner input = new Scanner(System.in);
        int com = 4;
        int user;
        do {
            System.out.println("Please guessing number 0 to 10 : ");
            user = input.nextInt();
        } while (com != user);
        System.out.println("You can found the number");
    }
}
