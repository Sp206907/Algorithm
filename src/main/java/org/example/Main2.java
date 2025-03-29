package org.example;

import java.util.Scanner;

public class Main2 {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if (n == 2) return true;
        return isPrimeHelper(n,2);
    }
    public static boolean isPrimeHelper(int n,int d){
        if (d * d > n) return true;
        if (n%d==0) return false;
        return isPrimeHelper(n,d+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Composite");
    }
}
