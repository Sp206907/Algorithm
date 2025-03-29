package org.example;
import java.util.Scanner;

public class Main {
    public static int findMin(int[] arr, int n) {
        if (n == 1)
            return arr[0];

        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findMin(arr, n));

        scanner.close();
    }
}


