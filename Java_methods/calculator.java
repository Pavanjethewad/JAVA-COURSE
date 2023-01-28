package Java_methods;

import java.util.Scanner;

public class calculator {
    public static Scanner sc = new Scanner(System.in);


    public static int addNumber(int a , int b){
        return a+b;
    }

    public static int substraction(int a , int b){
        return a-b;
    }

    public static int multiply(int a , int b){
        return a*b;
    }

    public static int divide(int a , int b){
        return a/b;
    }
    public static int rem(int a , int b){
        return a%b;
    }
    
    public static int pow(int a , int b){
        return (int)Math.pow(a, b);
    }




    public static int Calculator(int a , char ch , int b){
        if(ch == '+')
            return addNumber(a, b);
        else if(ch=='-')
            return substraction(a, b);
        else if(ch=='*')
            return multiply(a, b);

        else if(ch=='/')
            return divide(a, b);
        else if(ch=='%')
            return rem(a, b);
        else if(ch=='^')
            return pow(a,b);
        else{
            
            System.out.println("invalid input");
            return -1;
        }
        
        


    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0); 


        int ans = Calculator(a, ch, b);
        System.out.println(ans);
        
        

    }
    
}
