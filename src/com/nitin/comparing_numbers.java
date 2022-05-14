package com.nitin;

import java.util.Scanner;

public class comparing_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("******This program is to compare between two numbers that which one is greater*******");
        System.out.print("Enter fitsr number:");
        int num1 = in.nextInt();
        System.out.print("Enter second number:");
        int num2 = in.nextInt();
        if (num1 > num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else {
            System.out.println(num2+" is greater than "+num1);
        }



    }
}
