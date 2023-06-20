package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class BinarySearch {
    
    public static int binary_search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }    
        }
        
        return -1;
    }
    
    public void main_func(){
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

        int index = binary_search(arr, target);

        if (index != -1) {
            System.out.println(" Element " + target + " found at index " + index);
        } else {
            System.out.println(" Element " + target + " not found in the array!");
        }
    }
    
}
