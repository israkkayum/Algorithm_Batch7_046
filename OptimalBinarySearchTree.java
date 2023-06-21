package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class OptimalBinarySearchTree {

    static double optimalBST(double[] keys, double[] freq) {
        int n = keys.length;
        double[][] cost = new double[n + 1][n + 1];
        double[][] dp = new double[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            cost[i][i] = freq[i];
            dp[i][i] = freq[i];
        }

        for (int L = 2; L <= n; L++) {
            for (int i = 0; i <= n - L; i++) {
                int j = i + L - 1;
                cost[i][j] = Double.MAX_VALUE;
                dp[i][j] = 0;

                double sumFreq = getSumFreq(freq, i, j);

                for (int k = i; k <= j; k++) {
                    double currentCost = ((k > i) ? cost[i][k - 1] : 0)
                                   + ((k < j) ? cost[k + 1][j] : 0)
                                   + sumFreq;

                    if (currentCost < cost[i][j]) {
                        cost[i][j] = currentCost;
                        dp[i][j] = sumFreq;
                    }
                }
            }
        }

        return cost[0][n - 1];
    }

    static double getSumFreq(double[] freq, int start, int end) {
        double sumFreq = 0;
        for (int i = start; i <= end; i++) {
            sumFreq += freq[i];
        }
        return sumFreq;
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of keys: ");
        int n = s.nextInt();

        double[] keys = new double[n];
        double[] freq = new double[n];

        System.out.print(" Enter the keys: ");
        for (int i = 0; i < n; ++i) {
            keys[i] = s.nextDouble();
        }

        System.out.print(" Enter the frequencies: ");
        for (int i = 0; i < n; ++i) {
            freq[i] = s.nextDouble();
        }

        double optimalCost = optimalBST(keys, freq);

        System.out.println(" Optimal BST Cost: " + optimalCost);

    }

}
