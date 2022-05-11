package com.nitin;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = input.nextInt();
        System.out.print("enter second number : ");
        int b = input.nextInt();
        int sub = a - b;
        System.out.println("subtraction of two numbers is " + sub);
    }
}
