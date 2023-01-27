package Java_basics;
import java.util.*;

public class greaterNuber {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("number "+a+" is greater");
        }else if(b>a && b>c){
            System.out.println("number "+c+" is greater");

        }else
            System.out.println("number "+c+" is greater");

    }
    
}