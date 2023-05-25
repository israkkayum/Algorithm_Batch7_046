package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class InsertionSort {

    public void insertion_sort() {

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
        for (int i = 1; i < size; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

            // show pass
            System.out.println("");
            System.out.print(" Pass " + i + ":");

            for (int k = 0; k < size; k++) {
                System.out.print(" " + arr[k] + " ");
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
