package Java_methods;

import java.util.Scanner;

public class example1 {
    public static Scanner sc = new Scanner(System.in);


    public static int addNumbers(){
        int a = sc.nextInt();
        int b = sc.nextInt();
         return a+b;
    }

    public static boolean isEvenNumber(int n){
        // int n = sc.nextInt();
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void printStatement(String statement){
        System.out.println(statement);
    }

    public static void main(String[] args) {
        // int ans = addNumbers();
        // System.out.println(ans);
       
       
        // int n = sc.nextInt();
        // boolean ans = isEvenNumber(n);
        // System.out.println(ans);

        printStatement("hi my name is Pavan");
    }
}
