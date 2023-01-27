package Java_Loops;

import java.util.Scanner;

public class minNumberImput {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n =sc.nextInt();
        int minNum =Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            minNum= Math.min(minNum, num);

        }
        System.out.println("Min number is : "+minNum);
    }
}
