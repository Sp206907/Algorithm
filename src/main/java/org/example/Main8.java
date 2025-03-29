package org.example;

import java.util.Scanner;

public class Main8 {
    public static int binomialCoefficient(int n, int k) {
        if (k>n){
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n-1, k-1)+binomialCoefficient(n-1, k);


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }
}
