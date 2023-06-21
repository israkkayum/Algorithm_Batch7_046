package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class zeroOneKnapsack {
    
    public int knapsack(int W, int[] wt, int[] val, int n)
    {
        int[][] dp = new int[n+1][W+1];
        
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if(wt[i-1] <= w){
                    dp[i][w] = Math.max(val[i-1] + dp[i-1][w - wt[i-1]], dp[i-1][w]);
                }
                else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][W];
    }
  
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Knapsack capacity => ");
        int W = s.nextInt();
        
        System.out.print("Number of items => ");
        int n = s.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        
        System.out.print("Weights item => ");
        for (int i = 0; i < n; i++) 
            wt[i] = s.nextInt();
        
         System.out.print("Value item => ");
        for (int i = 0; i < n; i++) 
            val[i] = s.nextInt();
        
        int maxVal = knapsack(W, wt, val, n);
        System.out.println("Maximum value: "+ maxVal);
    }
    
}
