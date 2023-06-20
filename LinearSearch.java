package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class LinearSearch {
    
    public static int linear_search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        
        return -1;
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.print(" Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print(" Enter the target element to search: ");
        int target = s.nextInt();

        int index = linear_search(arr, target);

        if (index != -1) {
            System.out.println(" Element " + target + " found at index " + index);
        } else {
            System.out.println(" Element " + target + " not found in the array!");
        }
    }

}
