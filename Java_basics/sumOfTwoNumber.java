package Java_basics;
import java.util.Scanner;

public class sumOfTwoNumber {
    public static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
        // 
        int a = Scan.nextInt();
        int b = Scan.nextInt();

        int sum = (a+b);
        System.out.println("Sum of numbers is "+sum);
    }
}
