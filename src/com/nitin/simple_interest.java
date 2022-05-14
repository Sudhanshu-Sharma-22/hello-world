package com.nitin;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("********This program is to fine the simple interest*********");
        System.out.print("Enter principle amount:");
        int principle = in.nextInt();
        System.out.print("Enter time in days :");
        int time = in.nextInt();
        System.out.print("Enter interest rate:");
        int rate = in.nextInt();
        int simple_intrst = principle * (1+(rate * time));
        System.out.print("simple interest on given data is : "+simple_intrst);
    }
}
