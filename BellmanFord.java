package com.mycompany.algorithm_final_project;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class BellmanFord {

    public static int[] bellmanFord(int numVertices, int numEdges, int[][] edges, int source) {
        int[] distances = new int[numVertices+1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        for (int i = 1; i < numVertices; i++) {
            for (int j = 0; j < numEdges; j++) {
                int u = edges[j][0];
                int v = edges[j][1];
                int weight = edges[j][2];

                if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                }
            }
        }

        for (int j = 0; j < numEdges; j++) {
            int u = edges[j][0];
            int v = edges[j][1];
            int weight = edges[j][2];

            if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                System.out.println(" Negative cycle detected. The graph contains negative-weight cycles.");
                return null;
            }
        }

        return distances;
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of vertices in the graph: ");
        int numVertices = s.nextInt();

        System.out.print(" Enter the number of edges in the graph: ");
        int numEdges = s.nextInt();

        int[][] edges = new int[numEdges+1][3];

        System.out.println(" Enter the edges in the following format (source, destination, weight):");
        for (int i = 0; i < numEdges; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            edges[i][0] = s.nextInt();
            edges[i][1] = s.nextInt();
            edges[i][2] = s.nextInt();
        }

        System.out.print(" Enter the source vertex: ");
        int source = s.nextInt();

        int[] distances = bellmanFord(numVertices, numEdges, edges, source);

        System.out.println(" Shortest distances from source vertex " + source + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vertex " + i + ": " + distances[i]);
        }
    }
}
