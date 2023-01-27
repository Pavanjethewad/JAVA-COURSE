package Java_Loops;

import java.util.Scanner;

public class printOnlyEven {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            if (i%2==0) {
                System.out.println("Even : "+i);
           
        }
           
    }
    }
}
