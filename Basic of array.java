import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 95;
        marks[3] = 80;
        marks[4] = 92;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        Arrays.sort(marks);
        System.out.println(marks);
    }
}
