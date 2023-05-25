package com.mycompany.algorithm_final_project;

import java.util.Scanner;

public class matrixChainMultiplication {
    
    public static void print_optimal_parenthesis(int[][] s, int i, int j){
        if (i==j) {
            System.out.print("A"+i);
        }
        else{
            System.out.print("(");
            print_optimal_parenthesis(s, i, s[i][j]);
            print_optimal_parenthesis(s, s[i][j]+1, j);
            System.out.print(")");
        }
    }
    
    public static int matrix_chain_multiplication(int[] dimensions){
        int n = dimensions.length - 1;
        int[][] m = new int[n+1][n+1];
        int[][] s = new int[n+1][n+1];
        
        for(int i = 1; i <= n; i++){
            m[i][i] = 0;
        }
        
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i <= n-len+1; i++) {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                
                for (int k = i; k <= j-1; k++) {
                    int cost = m[i][k] + m[k+1][j] + dimensions[i-1] * dimensions[k] * dimensions[j];
                    
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }
        
        System.out.print("Optimal Parenthesization: ");
        print_optimal_parenthesis(s, 1, n);
        System.out.println("");
        
        return m[1][n];
    }
  
    public void main_method(){
       Scanner s = new Scanner(System.in);
        System.out.print("Enter dimensions size => ");
       int n  = s.nextInt();
       int[] dimensions = new int[n];
       
        System.out.print("Enter dimensions value => ");
       for (int i = 0; i < n; i++) {
           dimensions[i] = s.nextInt();
       }
        
       int minimumMultiplication = matrix_chain_multiplication(dimensions);
        System.out.println("Minimum number of multiplications: "+ minimumMultiplication); 
    }
    
}
