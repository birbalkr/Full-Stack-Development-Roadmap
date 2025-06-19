
import java.util.Scanner;

public class num_occurrences {

    public static void main(String[] args) {
        Scanner searchInput = new Scanner(System.in);
        int[] numArray = ArrayUtilit.inputArray();
        int item = search(numArray);
        System.out.println("Number of Element: " + item);

    }

    public static int search(int[] numArray) {
        Scanner searchInput = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("Enter Search Element");
        int userInput = searchInput.nextInt();
        while (i < numArray.length) {
            if (numArray[i] == userInput) {
                sum += 1;
            }
            i++;
        }
        return sum;
    }

}
