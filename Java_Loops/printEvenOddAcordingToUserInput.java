package Java_Loops;

import java.util.Scanner;

public class printEvenOddAcordingToUserInput {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Boolean isEven = sc.nextBoolean();
        for (int i = 0; i <n; i++) {
            if(isEven==true){
                if(i%2==0){
                    System.out.println("Even : "+i);
                }
            }else{
                System.out.println("Odd : "+i);
            }
        }
    }
}
