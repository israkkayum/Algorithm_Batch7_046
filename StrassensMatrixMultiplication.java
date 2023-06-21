package com.mycompany.algorithm_final_project;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

public class StrassensMatrixMultiplication {

    public static int[][] matrixMultiply(int[][] A, int[][] B) {
        int n = A.length;

        // Base case: if the matrix are 1*1
        if (n == 1) {
            int[][] C = new int[1][1];
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        // Splitting matrix into quadrants
        int mid = n / 2;
        int[][] A11 = new int[mid][mid];
        int[][] A12 = new int[mid][mid];
        int[][] A21 = new int[mid][mid];
        int[][] A22 = new int[mid][mid];
        int[][] B11 = new int[mid][mid];
        int[][] B12 = new int[mid][mid];
        int[][] B21 = new int[mid][mid];
        int[][] B22 = new int[mid][mid];

        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < mid; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + mid];
                A21[i][j] = A[i + mid][j];
                A22[i][j] = A[i + mid][j + mid];
                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + mid];
                B21[i][j] = B[i + mid][j];
                B22[i][j] = B[i + mid][j + mid];
            }
        }

        // Recursive computation
        int[][] P1 = matrixMultiply(A11, matrixSubtraction(B12, B22));
        int[][] P2 = matrixMultiply(matrixAddition(A11, A12), B22);
        int[][] P3 = matrixMultiply(matrixAddition(A21, A22), B11);
        int[][] P4 = matrixMultiply(A22, matrixSubtraction(B21, B11));
        int[][] P5 = matrixMultiply(matrixAddition(A11, A22), matrixAddition(B11, B22));
        int[][] P6 = matrixMultiply(matrixSubtraction(A12, A22), matrixAddition(B21, B22));
        int[][] P7 = matrixMultiply(matrixSubtraction(A11, A21), matrixAddition(B11, B12));
        
        // Computing sub-matrices
        int[][] C11 = matrixAddition(matrixSubtraction(matrixAddition(P5, P4), P2), P6);
        int[][] C12 = matrixAddition(P1, P2);
        int[][] C21 = matrixAddition(P3, P4);
        int[][] C22 = matrixSubtraction(matrixSubtraction(matrixAddition(P5, P1), P3), P7);

        // Combining sub-matrix to form the result
        int[][] C = new int[n][n];
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < mid; j++) {
                C[i][j] = C11[i][j];
                C[i][j + mid] = C12[i][j];
                C[i + mid][j] = C21[i][j];
                C[i + mid][j + mid] = C22[i][j];
            }
        }
        
        return C;
    }

    // matrix addition
    public static int[][] matrixAddition(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    // matrix subtraction
    public static int[][] matrixSubtraction(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }
    
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the size of the matrices (n): ");
        int n = s.nextInt();

        System.out.print(" Enter the element of matrix A: ");
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = s.nextInt();
            }
        }

        System.out.print(" Enter the element of matrix B: ");
        int[][] B = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = s.nextInt();
            }
        }

        int[][] result = matrixMultiply(A, B);
        
        System.out.println("Resultant matrix: ");
        printMatrix(result);
    }

}
