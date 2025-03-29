package org.example;

import java.util.Scanner;

public class Main7 {
    public static boolean isDigit(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isDigit(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.isEmpty()) {
            System.out.println("Enter a string");
        } else if (isDigit(s, 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}

