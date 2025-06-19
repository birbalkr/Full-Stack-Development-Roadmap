
import java.util.Scanner;

public class ArrayUtilit {

    public static int[] inputArray() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome a Array World");

        System.out.print("Please enter a number of elements: ");
        // Scanner element = new Scanner(System.in);

        int size = input.nextInt();
        int[] num = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Please enter element no " + (i + 1) + " :");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }
}
