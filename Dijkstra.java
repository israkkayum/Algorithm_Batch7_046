package com.mycompany.algorithm_final_project;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class Dijkstra {

    public static int[] dijkstra(int[][] graph, int source) {
        int v = graph.length;

        int[] distance = new int[v];
        boolean[] visited = new boolean[v];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        for (int i = 0; i < v - 1; i++) {
            int min_v = getMinDistanceVertex(distance, visited);
            visited[min_v] = true;

            for (int j = 0; j < v; j++) {
                if (!visited[j] && graph[min_v][j] != 0 && distance[min_v] != Integer.MAX_VALUE
                               && distance[min_v] + graph[min_v][j] < distance[j]) {
                    distance[j] = distance[min_v] + graph[min_v][j];
                }
            }
        }

        return distance;
    }

    public static int getMinDistanceVertex(int[] distance, boolean[] visited) {
        int min_v = -1;
        int min_dis = Integer.MAX_VALUE;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < min_dis) {
                min_v = i;
                min_dis = distance[i];
            }
        }

        return min_v;
    }

    public static void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of vertices in the graph: ");
        int n = s.nextInt();

        System.out.print(" Enter the number of edges in the graph: ");
        int m = s.nextInt();

        int[][] graph = new int[n+1][n+1];

        System.out.println(" Enter the edges and weight: ");
        for (int i = 0; i < m; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            int wt = s.nextInt();

            graph[x][y] = wt;
        }

        System.out.print(" Enter the source vertex: ");
        int source = s.nextInt();

        int[] distances = dijkstra(graph, source);

        System.out.println(" Shortest distances from source vertex " + source + ": ");
        for (int i = 0; i < n; i++) {
            System.out.println(" Vertex " + i+1 + ": " + distances[i]);
        }
    }
}
