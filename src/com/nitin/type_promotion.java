package com.nitin;

public class type_promotion {
    public static void main(String[] args) {
        int a = 1234;
        float b = 26.69f;
        long c = 1234567892;
        double d = 12345.67892;
        char e = 'F';

        double ans = (a * b) + (c + d) + e;
        // output
        //a * b = float ;
        // c * d = double ;
        // e = int ;
        // a*b + c*d + e = double


        System.out.println(ans);
    }
}