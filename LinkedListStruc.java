package com.mycompany.algorithm_final_project;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class LinkedListStruc {
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        // create linked list object
        LinkedList<Integer> linkedlist = new LinkedList<>();
        
        System.out.print(" Enter the number of elements: ");
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(" Enter element " + (i+1) + ": ");
            int element = s.nextInt();
            linkedlist.add(element);
        }
        
        // print the linked list
        System.out.println(" Linked List: " + linkedlist);
    }
    
}
