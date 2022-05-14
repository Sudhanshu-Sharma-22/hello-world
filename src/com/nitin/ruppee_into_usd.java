package com.nitin;

import java.util.Scanner;

public class ruppee_into_usd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("********THIS PROGRAM WILL HELP YOU IN CONVERTING RUPPPE VALUE IN USD******");
        System.out.print("Enter ruppees:");
        int amount_in_ruppee = in.nextInt();
        double usd = 0.013 * amount_in_ruppee;
        System.out.println(amount_in_ruppee+" ruppee into usd is : "+usd);


    }
}
