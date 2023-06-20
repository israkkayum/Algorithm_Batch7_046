package com.mycompany.algorithm_final_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class BinSort {
    
    public void bin_sort(double[] arr){
        int n = arr.length;
        
        // Create empty bucket
        ArrayList<Double>[] buckets = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Put array elements in different bucket
        for (int i = 0; i < n; i++) {
            int index = (int) (n * arr[i]);
            buckets[index].add(arr[i]); 
        }
        
        // sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        
        // Concatenate all the buckets into ar[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < buckets[i].size(); j++){
                arr[index++] = buckets[i].get(j);
            }
        }
    }
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        System.out.print(" Enter the number of elements: ");
        int n = s.nextInt();
        
        double[] arr = new double[n];
        System.out.print(" Enter the elements: ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextDouble();
        }
        
        System.out.print(" Original array: ");
        for(double num : arr){
            System.out.print(num + " ");
        }
        System.out.println("");
        
        bin_sort(arr);
        
        System.out.print(" Sorted array: ");
        for(double num : arr){
            System.out.print(num + " ");
        }
    }
    
}
