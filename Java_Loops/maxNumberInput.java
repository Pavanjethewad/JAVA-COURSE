package Java_Loops;

import java.util.Scanner;

public class maxNumberInput {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int maxNum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            
            maxNum=Math.max(maxNum, num);
        }
        System.out.println("Max number is "+maxNum);
    }
}
