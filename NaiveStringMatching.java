package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class NaiveStringMatching {

    static int naiveStringMatching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
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

        int index = naiveStringMatching(text, pattern);

        System.out.println(" Pattern found at index: " + index);
    }

}
