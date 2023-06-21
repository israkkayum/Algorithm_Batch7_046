package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class Stack {

    final static int MAX = 10;
    static int[] arr = new int[MAX];
    static int top = -1;

    // push function
    public static void push() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the elements: ");
        int element = s.nextInt();

        if (top == MAX - 1) {
            System.out.println(" Stack Overflow!");
        } else {
            top++;
            arr[top] = element;
        }
    }

    // pop function
    public static void pop() {
        if (top == -1) {
            System.out.println(" Stack Underflow!");
        } else {
            System.out.println(" Remove element " + arr[top]);
            top--;
        }
    }
    
    // peek fuction
    public static void peek(){
        if (top == -1) {
            System.out.println(" Stack Underflow!");
        }
        else{
            System.out.println(" Peek element is "+ arr[top]);
        }
    }

    // display
    public static void display() {
        if (top == -1) {
            System.out.println(" Stack is Empty!");
        } else {
            System.out.print(" Stack elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[top] + " ");
            }
            System.out.println("");
        }
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("  1. Push");
            System.out.println("  2. Pop");
            System.out.println("  3. Peek");
            System.out.println("  4. Display");
            System.out.println("  5. Exit");
            System.out.println("");
            System.out.print(" Choice your suitable option --> ");

            int c = s.nextInt();

            switch (c) {
                case 1:
                    //push

                    push();

                    break;

                case 2:
                    //pop

                    pop();

                    break;
                    
                case 3:
                    //pop

                    peek();

                    break;

                case 4:
                    // display

                    display();

                    break;

                case 5:
                    //exit
                    return;

                default:
                    System.out.println(" Invalid Input!");
            }
        }
    }
}
