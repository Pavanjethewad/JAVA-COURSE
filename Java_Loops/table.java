package Java_Loops;

import java.util.Scanner;

public class table {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n =sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }
    }
}
