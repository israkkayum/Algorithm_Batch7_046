package com.mycompany.algorithm_final_project;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    
    static int lis(int i, int[] a){
        int ans = 1;
        for (int j = 0; j < i; j++) {
            if (a[i] > a[j]) {
                ans = Math.max(ans, lis(j, a) + 1);
            }
        }
        return ans;
    }
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        System.out.print(" Enter the elements size: ");
        int n = s.nextInt();
        int[] nums = new int[n];
        
        System.out.print(" Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, lis(i, nums));
        }
        
        System.out.print(" Longest Increasing Subsequence Length: " + ans);
    }
    
}
