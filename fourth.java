public class fourth {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("Enter elements in array");
        for (int i = 0; i < 5; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Enter element to search");
        int num = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (ar[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }
    }
}
