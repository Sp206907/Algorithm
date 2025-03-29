package org.example;

import java.util.Scanner;

public class Main5 {
    public static int PowerOf(int a, int n){
        if (n==0) return 1;
        return a*PowerOf(a, n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        System.out.println(PowerOf(a,n));
    }
}
