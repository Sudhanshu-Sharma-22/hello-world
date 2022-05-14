package com.nitin;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number to check whether it is odd or even");
        int num = in.nextInt();
        if (num % 2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

    }
}
