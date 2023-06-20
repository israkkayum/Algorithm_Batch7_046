package com.mycompany.algorithm_final_project;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class ShellSort {
    
    public static void shell_sort(int[] arr){
        int n = arr.length;
        
        for (int gap = n/2; gap >= 1; gap/=2) {
            for (int j = gap; j < n; j++) {
                for (int i = j-gap; i >= 0; i-=gap) {
                    if (arr[i+gap] > arr[i]) {
                        break;
                    }
                    else{
                        int temp = arr[i];
                        arr[i] = arr[i+gap];
                        arr[i+gap] = temp;
                    }  
                }
            }
        }
    }
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        System.out.print(" Enter the number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.print(" Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(" Original array: " + Arrays.toString(arr));

        shell_sort(arr);
        
        System.out.println(" Sorted array: " + Arrays.toString(arr));
    }
    
}
