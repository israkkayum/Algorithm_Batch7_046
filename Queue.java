package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class Queue {

    final static int MAX = 10;
    static int[] arr = new int[MAX];
    static int front = -1;
    static int rear = -1;

    // enQueue function
    public static void en_queue() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the element: ");
        int x = s.nextInt();

        if (rear == MAX - 1) {
            System.out.println(" Queue Overflow!");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            arr[rear] = x;
        }
        else{
            rear++;
            arr[rear] = x;
        }
    }
    
    // deQueue function
    public static void de_queue(){
        if (front == -1 && rear == -1) {
            System.out.println(" Queue Underflow!");
        }
        else if(front == rear){
            front = rear = -1;
        }
        else{
            front++;
        }
    }
    
    // peek function
    public static void peek(){
        if (front == -1 && rear == -1) {
            System.out.println(" Queue Underflow!");
        }
        else{
            System.out.println(" Queue peek value is "+ arr[front]);
        }
    }
    
    // display function
    public static void display(){
        if (front == -1 && rear == -1) {
            System.out.println(" Quue is Empty!");
        }
        else{
            System.out.print(" Queue elements are: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]+ " ");
            }
        }
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("  1. enQueue");
            System.out.println("  2. deQueue");
            System.out.println("  3. Peek");
            System.out.println("  4. Display");
            System.out.println("  5. Exit");
            System.out.println("");
            System.out.print(" Choice your suitable option --> ");

            int c = s.nextInt();

            switch (c) {
                case 1:
                    //enQueue

                    en_queue();

                    break;

                case 2:
                    //deQueue

                    de_queue();

                    break;

                case 3:
                    //peek

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
