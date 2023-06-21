package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class MergeSort {

    static int[] merge(int[] a, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;
        int[] b = new int[a.length];

        while (i <= mid && j <= ub) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            while (j <= ub) {
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                i++;
                k++;
            }
        }

        for (k = lb; k <= ub; k++) {
            a[k] = b[k];
        }

        return a;
    }

    static int[] merge_sort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            merge_sort(a, lb, mid);
            merge_sort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }

        return a;
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.print(" Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] result = merge_sort(arr, 0, n - 1);

        System.out.print(" Sorted elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
