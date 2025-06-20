package Java.control_statements_string_math;

public class Loop {

    public static void main(String[] args) {
        // ************ for loop
        // for (int j = 1; j <= 100; j++) {
        //     System.out.print(j + " ");
        // }
        // System.out.println("\n");
        // for (int j = 1; j <= 100; j += 2) {
        //     System.out.print(j + " ");
        // }

        String[] array = new String[]{
            "Ram", "Shyam", "Mohan", "Sohan", "Sita"
        };
        printArray(array);
    }

    public static void printArray(String[] array) {
        // for loop 
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }

        // for each  
        for (String name : array) {
            System.out.println(name);
        }

    }
}
