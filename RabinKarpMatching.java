package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class RabinKarpMatching {

    static final int d = 256;
    static final int prime = 101;

    static int rabin_karp_matching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int i, j;
        int patternHash = 0;
        int textHash = 0;

        for (i = 0; i < m; i++) {
            patternHash = (d * patternHash + pattern.charAt(i)) % prime;
            textHash = (d * textHash + text.charAt(i)) % prime;
        }

        int h = 1;
        for (i = 0; i < m - 1; i++) {
            h = (h * d) % prime;
        }

        for (i = 0; i <= n - m; i++) {

            if (patternHash == textHash) {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    return i;
                }
            }

            if (i < n - m) {
                textHash = (d * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (textHash < 0) {
                    textHash += prime;
                }
            }
        }
        return -1;
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the text: ");
        String text = s.nextLine();

        System.out.print(" Enter the pattern: ");
        String pattern = s.nextLine();

        int result = rabin_karp_matching(text, pattern);

        System.out.println(" Pattern found at index: " + result);
    }

}
