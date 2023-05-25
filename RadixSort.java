package com.mycompany.algorithm_final_project;

import java.util.Scanner;

public class RadixSort {

    public void radix_sort() {

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

        // find maximum number --> max
        int max = 0;

        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // sorting operation
        for (int pos = 1; max / pos > 0; pos *= 10) {

            // counting sort
            int[] temp = new int[size];
            int[] count = new int[11];

            for (int i = 0; i < size; i++) {

                ++count[arr[i] / pos % 10];  // counting
            }

            for (int i = 1; i <= 10; i++) {

                count[i] = count[i] + count[i - 1]; // counting update
            }

            for (int i = size - 1; i >= 0; i--) {

                temp[--count[((arr[i] / pos) % 10)]] = arr[i];  // sort value
            }

            for (int i = 0; i < size; i++) {  // value copy
                arr[i] = temp[i];  
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
