import java.util.Scanner;

class thirdSumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        // Input elements
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = sum / 10.0;

        // Output
        System.out.println("Total Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}