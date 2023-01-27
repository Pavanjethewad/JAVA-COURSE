package Java_basics;
import java.util.*;
public class oddEven {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("number "+a+" is even");
        }else{
            System.out.println("number "+a+" is odd");
        }

    }
}
