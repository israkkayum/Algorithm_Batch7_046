package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class FibonacciSeries {
    
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        System.out.print(" Enter the number of Fibonacci numbers to generate: ");
        int n = s.nextInt();
        
        System.out.print(" Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            int fibonacciNumber = fibonacci(i);
            System.out.print(fibonacciNumber +" ");
        }
    }
    
}
