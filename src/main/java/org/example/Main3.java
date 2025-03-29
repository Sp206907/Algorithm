package org.example;

import java.util.Scanner;

public class Main3 {
    public static int FindFactorial(int n) {
        if (n == 0) return 1;
        return FindFactorial(n - 1) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FindFactorial(n));
    }
}
