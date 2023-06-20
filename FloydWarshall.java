package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class FloydWarshall {
    
    final int INF = Integer.MAX_VALUE;
    final int N = 510;
    int[][] dist = new int[N][N];
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) dist[i][j] = 0;
                else dist[i][j] = INF;
            }
        }
        
        System.out.print(" Enter the number of vertices and edges: ");
        int n = s.nextInt();
        int m = s.nextInt();
        
        System.out.println(" Enter the edges and weights: ");
        for (int i = 0; i < m; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            int wt = s.nextInt();
            
            dist[x][y] = wt;
        }
        
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(dist[i][k] != INF && dist[k][j] != INF){
                        dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        
        System.out.println("");
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("I ");
                }
                else{
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    
}
