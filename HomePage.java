package com.mycompany.algorithm_final_project;

import java.util.LinkedList;
import java.util.Scanner;

public class HomePage {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("");
            System.out.println("-------------* Available Options *-------------");

            System.out.println("");
            System.out.println("  01. Data structure");
            System.out.println("  02. Algorithm");
            System.out.println("");

            System.out.print(" Choice a suitable option --> ");

            int n = s.nextInt();

            if (n == 1) {

                // Data structure section
                System.out.println("");

                System.out.println("-------------* Available Options *-------------");

                System.out.println("");
                System.out.println("  01. Insertion sort");
                System.out.println("  02. Selection sort");
                System.out.println("  03. Bubble sort");
                System.out.println("  04. Marge sort");
                System.out.println("  05. Quick sort");
                System.out.println("  06. Counting sort");
                System.out.println("  07. Radix sort");
                System.out.println("  08. Heap sort");
                System.out.println("  09. Bin sort");
                System.out.println("  10. Shell sort");
                System.out.println("  11. Linear search");
                System.out.println("  12. Binary search");
                System.out.println("  13. Eulidean GCD algorithm");
                System.out.println("  14. Universal hashing");
                System.out.println("  15. Stack");
                System.out.println("  16. Queue");
                System.out.println("  17. Linked list");
                System.out.println("  18. Fibonacci series");
                System.out.println("  19. Recurrences");
                System.out.println("");

                System.out.print(" Choice a suitable option --> ");

                int a = s.nextInt();

                System.out.println("");

                switch (a) {

                    case 1:
                        // Insertion sort

                        InsertionSort insertionObj = new InsertionSort();
                        insertionObj.insertion_sort();

                        break;

                    case 2:
                        // Selection sort

                        SelectionSort selectionObj = new SelectionSort();
                        selectionObj.selection_sort();

                        break;

                    case 3:
                        // Bubble sort

                        BubbleSort bubbleObj = new BubbleSort();
                        bubbleObj.bubble_sort();

                        break;

                    case 4:
                        // Marge sort

                        MergeSort mergeObj = new MergeSort();
                        mergeObj.main_func();

                        break;

                    case 5:
                        // Quick sort
                        
                        QuickSort qsObj = new QuickSort();
                        qsObj.main_func();

                        break;

                    case 6:
                        // Counting sort

                        CountingSort countingObj = new CountingSort();
                        countingObj.counting_sort();

                        break;

                    case 7:
                        // Radix sort

                        RadixSort radixObj = new RadixSort();
                        radixObj.radix_sort();

                        break;

                    case 8:
                        // Heap sort

                        HeapSort hsObj = new HeapSort();
                        hsObj.main_func();

                        break;

                    case 9:
                        // Bin sort

                        BinSort binObj = new BinSort();
                        binObj.main_func();

                        break;

                    case 10:
                        // Shell sort
                        
                        ShellSort ssObj = new ShellSort();
                        ssObj.main_func();

                        break;

                    case 11:
                        // Linear search
                        
                        LinearSearch lsObj = new LinearSearch();
                        lsObj.main_func();

                        break;

                    case 12:
                        // Binary search
                        
                        BinarySearch bsObj = new BinarySearch();
                        bsObj.main_func();

                        break;

                    case 13:
                        // Euclidean GCD algorithm

                        EuclideanGCD gcdObj = new EuclideanGCD();
                        gcdObj.main_func();

                        break;

                    case 14:
                        // Universal hashing

                        break;

                    case 15:
                        // Stack
                        
                        Stack sObj = new Stack();
                        sObj.main_func();

                        break;

                    case 16:
                        // Queue
                        
                        Queue qObj = new Queue();
                        qObj.main_func();

                        break;

                    case 17:
                        // Linked list
                        
                        LinkedListStruc llObj = new LinkedListStruc();
                        llObj.main_func();

                        break;

                    case 18:
                        // Fibonacci series

                        FibonacciSeries fsObj = new FibonacciSeries();
                        fsObj.main_func();
                        
                        break;

                    case 19:
                        // Recurrences

                        break;

                    default:
                        System.out.println(" *** Invalid Input");
                }

                System.out.println("");

            } else if (n == 2) {

                // Algorithm section
                System.out.println("");

                System.out.println("-------------* Available Options *-------------");

                System.out.println("");
                System.out.println("  01. Largest Common Subsequence");
                System.out.println("  02. Optimal Binary Search tree");
                System.out.println("  03. Matrix chain multiplication");
                System.out.println("  04. Strassen's matrix multiplication algorithm");
                System.out.println("  05. Breadth-First Search (BFS)");
                System.out.println("  06. Depth-First Search (DFS)");
                System.out.println("  07. Directed Acyclic Graph (DAG)");
                System.out.println("  08. Longest Increasing Subsequence");
                System.out.println("  09. Topological sort");
                System.out.println("  10. Krushkal's algorithm");
                System.out.println("  11. Prim's algorithm");
                System.out.println("  12. Dijkastra's algorithm");
                System.out.println("  13. Bellman Ford's algorithm");
                System.out.println("  14. Worshall's algorithm");
                System.out.println("  15. (0,1) Knapsack");
                System.out.println("  16. Native string matching algorithm");
                System.out.println("  17. Rabin Krap string matching algorithm");
                System.out.println("  18. Activity selection problem");
                System.out.println("  19. MST algorithm");
                System.out.println("  20. Max flow min cut");
                System.out.println("");

                System.out.print(" Choice a suitable option --> ");

                int b = s.nextInt();

                System.out.println("");

                switch (b) {

                    case 1:
                        // Longest Common Subsequence

                        LongestCommonSubsequence lcsObj = new LongestCommonSubsequence();
                        lcsObj.main_func();

                        break;

                    case 2:
                        // Optimal Binary Search tree

                        OptimalBinarySearchTree OBSTObj = new OptimalBinarySearchTree();
                        OBSTObj.main_func();

                        break;

                    case 3:
                        // Matrix Chain Multiplication

                        matrixChainMultiplication matrixObj = new matrixChainMultiplication();
                        matrixObj.main_method();

                        break;

                    case 4:
                        // Strassen's Matrix Multiplication Algorithm

                        StrassensMatrixMultiplication smmObj = new StrassensMatrixMultiplication();
                        smmObj.main_func();

                        break;

                    case 5:
                        // BFS

                        BFS bfsObj = new BFS();
                        bfsObj.bfs_graph();

                        break;

                    case 6:
                        // DFS

                        DFS dfsObj = new DFS();
                        dfsObj.dfs_graph();

                        break;

                    case 7:
                        // DAG

                        break;

                    case 8:
                        // Longest Increasing Subsequence

                        LongestIncreasingSubsequence lisObj = new LongestIncreasingSubsequence();
                        lisObj.main_func();

                        break;

                    case 9:
                        // Topological sort

                        break;

                    case 10:
                        // Krushkal's algorithm

                        Kruskals krusObj = new Kruskals();
                        krusObj.main_func();

                        break;

                    case 11:
                        // Prim's algorithm

                        break;

                    case 12:
                        // Dijkastra's algorithm

                        break;

                    case 13:
                        // Bellman Ford's algorithm

                        break;

                    case 14:
                        // Worshall's algorithm

                        FloydWarshall fwObj = new FloydWarshall();
                        fwObj.main_func();

                        break;

                    case 15:
                        // (0,1) KKnapsack problem

                        zeroOneKnapsack knapsackObj = new zeroOneKnapsack();
                        knapsackObj.main_func();

                        break;

                    case 16:
                        // Naive string matching algorithm

                        NaiveStringMatching nsmObj = new NaiveStringMatching();
                        nsmObj.main_func();

                        break;

                    case 17:
                        // Rabin krap string matching algorithm

                        RabinKarpMatching rkmObj = new RabinKarpMatching();
                        rkmObj.main_func();

                        break;

                    case 18:
                        // Activity selection problem

                        ActivitySelection asObj = new ActivitySelection();
                        asObj.main_func();

                        break;

                    case 19:
                        // MST algorithm

                        break;

                    case 20:
                        // Max flow min cut

                        break;

                    default:
                        System.out.println(" *** Invalid Input");
                }

                System.out.println("");

            } else {
                System.out.println("");
                System.out.println(" *** Please Enter Valid Input");
                System.out.println("");
            }

        }

    }

}
