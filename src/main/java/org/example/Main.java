package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Find Minimum in Array (Recursion)
        System.out.print("Enter size of array for min: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println("Minimum element: " + MinFinder.findMin(arr, n));

        // Task 2: Find Average in Array (Recursion)
        System.out.print("Enter size of array for average: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println("Average: " + AverageFinder.FindAvrg(arr, n));

        // Task 3: Check Prime Number (Recursion)
        System.out.print("Enter a number to check if prime: ");
        n = scanner.nextInt();
        System.out.println(PrimeChecker.isPrime(n) ? "Prime" : "Composite");

        // Task 4: Factorial Calculation (Recursion)
        System.out.print("Enter a number for factorial: ");
        n = scanner.nextInt();
        System.out.println("Factorial: " + FactorialFinder.FindFactorial(n));

        // Task 5: Fibonacci Sequence (Recursion)
        System.out.print("Enter index for Fibonacci: ");
        n = scanner.nextInt();
        System.out.println("Fibonacci: " + FibonacciFinder.Fibonacci(n));

        // Task 6: Power Function (Recursion)
        System.out.print("Enter base and exponent: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + PowerFinder.PowerOf(a, b));

        // Task 7: String Permutations (Uppercase Only)
        System.out.print("Enter a string (uppercase): ");
        scanner.nextLine(); // Consume newline
        String s = scanner.nextLine();
        System.out.println("Distinct Permutations:");
        StringPermutations.printDistinctPermutn(s, "");

        // Task 8: Check if String Contains Only Digits (Recursion)
        System.out.print("Enter a string to check for digits: ");
        s = scanner.nextLine();
        System.out.println(DigitChecker.isDigit(s, 0) ? "Contains only digits" : "Contains non-digit characters");

        // Task 9: Binomial Coefficient (Recursion)
        System.out.print("Enter n and k for binomial coefficient: ");
        n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("Binomial Coefficient: " + BinomialCoefficient.binomialCoefficient(n, k));

        // Task 10: GCD Calculation (Recursion)
        System.out.print("Enter two numbers for GCD: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("GCD: " + GCD.GCD(x, y));

        scanner.close();
    }
}

// Task 1: Find Minimum in Array
class MinFinder {
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
}

// Task 2: Find Average in Array
class AverageFinder {
    public static double FindSUm(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + FindSUm(arr, n - 1);
    }

    public static double FindAvrg(int[] arr, int n) {
        if (arr == null || arr.length == 0) return -1;
        return FindSUm(arr, n) / arr.length;
    }
}

// Task 3: Check Prime Number
class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n, int d) {
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrimeHelper(n, d + 1);
    }
}

// Task 4: Factorial Calculation
class FactorialFinder {
    public static int FindFactorial(int n) {
        if (n == 0) return 1;
        return FindFactorial(n - 1) * n;
    }
}

// Task 5: Fibonacci Sequence
class FibonacciFinder {
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

// Task 6: Power Function
class PowerFinder {
    public static int PowerOf(int a, int n) {
        if (n == 0) return 1;
        return a * PowerOf(a, n - 1);
    }
}

// Task 7: String Permutations (Uppercase Only)
class StringPermutations {
    public static void printDistinctPermutn(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        boolean[] alpha = new boolean[26]; // For uppercase letters only

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);

            if (!alpha[ch - 'A']) {
                printDistinctPermutn(ros, ans + ch);
                alpha[ch - 'A'] = true;
            }
        }
    }
}

// Task 8: Check if String Contains Only Digits
class DigitChecker {
    public static boolean isDigit(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigit(s, index + 1);
    }
}

// Task 9: Binomial Coefficient
class BinomialCoefficient {
    public static int binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}

// Task 10: GCD Calculation
class GCD {
    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}



