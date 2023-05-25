package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class BubbleSort {

    public void bubble_sort() {

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
        for (int i = 0; i < size - 1; i++) {

            System.out.println("");
            System.out.println(" Pass " + (i + 1) + ":");

            for (int j = 0; j < size - i - 1; j++) {

                // swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                // dispaly pass
                //  System.out.println(Arrays.toString(arr));
                for (int k = 0; k < size; k++) {
                    System.out.print(" " + arr[k] + " ");
                }
                System.out.println("");
            }
        }

        System.out.println("");
        //Display array after sorting
        System.out.print(" Elements After Sorting --> ");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }

    }

}
