package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class SelectionSort {
    
    public void selection_sort()
    {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter Array Size --> ");

        int size = s.nextInt();

        int[] arr = new int[size];

        // array input
        System.out.print(" Enter Array Value --> ");

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        //Display array before sorting
        System.out.println("");

        System.out.print(" Elements Before Sorting --> ");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        // sorting operations
         
        for (int i = 0; i < size; i++) {
            
            int min = i;
            
            for (int j = i+1; j < size; j++) {
                
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            if (min != i) {
                
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                
            }
            
            System.out.println("");
            System.out.print(" Pass " + i + ": ");
            
            for (int k = 0; k < size; k++) {
                System.out.print(arr[k] + " ");
            }
            
            System.out.println("");
        }
        

        System.out.println("");
        //Display array after sorting
        System.out.print(" Elements After Sorting --> ");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
    }
    
}
