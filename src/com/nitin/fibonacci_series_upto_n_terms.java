package com.nitin;

import java.util.Scanner;

public class fibonacci_series_upto_n_terms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int temp1;
//        int temp2;
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println("series till "+n+" number");
        for (int i=1;i<=n;++i){
            System.out.println(a+',');
            int c = a + b;
            a=b;
            b=c;
        }

    }
}
