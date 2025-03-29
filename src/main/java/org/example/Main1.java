package org.example;

import java.util.Scanner;

public class Main1 {
    public static double FindSUm(int[] arr, int n){
        if (n==0) return 0;
        return arr[n-1]+FindSUm(arr, n-1);
    }
    public static double FindAvrg(int[] arr, int n){
        if (arr == null || arr.length == 0) return -1;
        return FindSUm(arr, n)/arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(FindAvrg(arr, n));

    }
}
