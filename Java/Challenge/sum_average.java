
class sum_average {

    public static void main(String[] args) {
        int[] numArray = ArrayUtilit.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("sum of the number is:" + sum);
        System.out.println("Average of the number is: " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
