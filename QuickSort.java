package com.mycompany.algorithm_final_project;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class QuickSort {
    
    private static void quick_sort(int[] arr, int low, int high){
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quick_sort(arr, low, partitionIndex - 1);
            quick_sort(arr, partitionIndex + 1, high);
            
        }
    }
    
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i+1, high);
        return i+1;
    }
    
    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of elements: ");
        int n = s.nextInt();
        
        int[] arr = new int[n];

        System.out.print(" Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.println(" Original array: " + Arrays.toString(arr));

        quick_sort(arr, 0, arr.length - 1);
        
        System.out.println(" Sorted array: " + Arrays.toString(arr));
    }
}
