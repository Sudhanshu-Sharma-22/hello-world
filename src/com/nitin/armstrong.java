package com.nitin;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter a number to check whether a number is armstrong or not:");
        int num = in.nextInt();
        while (num > 0){
            int rem = num % 10;1
            result = result + (rem*rem*rem);
            num = num/10;
        }
        if (result == num){
            System.out.println(num+" is an armstrong number");
        }
        else {
            System.out.println(num+" is not an armstrong number");
        }
    }
}
