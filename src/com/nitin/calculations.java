package com.nitin;
import java.util.Scanner;
public class calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = input.nextInt();
        System.out.print("enter second number : ");
        int b = input.nextInt();
        int sum = a + b ;
        int sub = a - b ;
        int mul = a * b ;
        int div = a / b ;
        System.out.println("submission of two numbers is "+sum);
        System.out.println("subtraction of two numbers is "+sub);
        System.out.println("multiplication of two numbers is "+mul);
        System.out.println("division of two numbers entered we get : "+div);

    }
}
