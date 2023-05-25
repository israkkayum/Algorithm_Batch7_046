
package com.mycompany.algorithm_final_project;

import java.util.Scanner;

public class CountingSort {
    
    public void counting_sort(){
    
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

        // find maximum number --> k
         
        int k = 0;
        
        for (int i = 0; i < size; i++) {
            if (k < arr[i]) {
                k = arr[i];
            }
        }
        
        // sorting operation
        
        int[] count = new int[k+1];
        int[] temp = new int[size];
        
        for (int i = 0; i < size; i++) { 
            
            ++count[arr[i]];  // counting 
        }
        
        for (int i = 1; i <= k; i++) { 
            
            count[i] = count[i] + count[i-1]; // update counting
        }
        
        for (int i = size-1; i >= 0; i--) {
            
            temp[--count[arr[i]]] = arr[i]; // insert sorting value
        }
        
        for (int i = 0; i < size; i++) {
            
            arr[i] = temp[i]; // transfer sorting value 
        }
        

        System.out.println("");
        //Display array after sorting
        System.out.print(" Elements After Sorting --> ");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
        
    }
    
}
