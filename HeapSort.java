package com.mycompany.algorithm_final_project;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    
    static void heap_sort(int[] arr){
        int size = arr.length;
        
        // Build max heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }

        // Extract elements from the heap one by one
        for (int i = size - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }
    
    static void heapify(int[] arr, int size, int root){
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        
         // If left child is larger than root
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, size, largest);
        }
        
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of elements: ");
        int n = s.nextInt();
        
        int[] arr = new int[n];
        System.out.println(" Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.println(" Original array: " + Arrays.toString(arr));

        heap_sort(arr);

        System.out.println(" Sorted array: " + Arrays.toString(arr));
    }

}
