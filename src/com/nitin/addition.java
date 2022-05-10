package com.nitin;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = 22;
//        int b = 69;
//        int c = a + b;
        System.out.print("enter first number : ");
        int a = input.nextInt();
        System.out.print("enter second number : ");
        int b = input.nextInt();
        int c = a+ b;
        System.out.println("sum of two number is = "+c);
    }
}
