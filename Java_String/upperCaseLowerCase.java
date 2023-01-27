package Java_String;

import java.util.Scanner;


public class upperCaseLowerCase {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        char ch =sc.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("character is lower case");
        else if(ch>='A' && ch<='Z')
            System.out.println("character is upper case");
        else
            System.out.println("invalid input");

    }
}
