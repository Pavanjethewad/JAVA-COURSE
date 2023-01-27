package Java_Loops;

import java.util.Scanner;

public class isPrime {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean flag = true;

        for(int i=2; i<n; i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }

        if(flag){

            System.out.println(n+" is Prime Number");
        }
        else{

            System.out.println(n+" Is Not A prime Number");
        }

    }
}
