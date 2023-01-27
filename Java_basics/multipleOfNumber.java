package Java_basics;

import java.util.Scanner;

public class multipleOfNumber {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = sc.nextInt();

       for ( int i=1; i<=count; i++){
            if(n%i==0){
                System.out.println("the number is divisible by :"+i);
            
            }
        }
    }
}
