package org.example;

public class Main6 {
    static void printDistinctPermutn(String rem, String cur)
    {
        if (rem.length() == 0) {
            System.out.print(cur + " ");
            return;
        }
        boolean[] alpha = new boolean[26];

        for (int i = 0; i < rem.length(); i++) {
            char ch = rem.charAt(i);
            if (ch < 'A' || ch > 'Z') continue;

            String ros = rem.substring(0, i) +
                    rem.substring(i + 1);
            if (!alpha[ch - 'A'])
                printDistinctPermutn(ros, cur + ch);
            alpha[ch - 'A'] = true;
        }
    }
    public static void main(String[] args)
    {
        String s = "IOX";
        printDistinctPermutn(s, "");
    }
}
