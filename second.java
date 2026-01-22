import java.util.Scanner;

class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[3];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter number " + (i + 1));
            ar[i] = scan.nextInt();
        }

        System.out.println("Array elements:");
        for (int x : ar) {
            System.out.print(x + " ");
        }
    }
}