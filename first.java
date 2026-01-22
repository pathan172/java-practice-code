import java.util.Scanner;

class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[3];
        System.out.println("enter the first number");
        ar[0] = scan.nextInt();
        System.out.println("enter the second number");
        ar[1] = scan.nextInt();
        System.out.println("enter the third number");
        ar[2] = scan.nextInt();
        System.out.println(ar[0] + "\t" + ar[1] + "\t" + ar[2]);
    }
}