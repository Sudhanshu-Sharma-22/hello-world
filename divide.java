package com.nitin;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = input.nextInt();
        System.out.print("enter second number : ");
        int b = input.nextInt();
        int div = a / b ;
        System.out.println("after diving two numbers we get "+div);
    }
}

