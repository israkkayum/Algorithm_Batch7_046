package com.mycompany.algorithm_final_project;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

class Graph {
    private int vertices;
    private int[][] residualGraph;

    public Graph(int vertices) {
        this.vertices = vertices;
        residualGraph = new int[vertices+1][vertices+1];
    }

    public void addEdge(int source, int destination, int capacity) {
        residualGraph[source][destination] = capacity;
    }

    public int maxFlow(int source, int sink) {
        int[] parent = new int[vertices];
        int maxFlow = 0;

        while (bfs(source, sink, parent)) {
            int pathFlow = Integer.MAX_VALUE;

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, residualGraph[u][v]);
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                residualGraph[u][v] -= pathFlow;
                residualGraph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    private boolean bfs(int source, int sink, int[] parent) {
        boolean[] visited = new boolean[vertices];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && residualGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return visited[sink];
    }
}

public class MaxFlowMinCut {

    public void main_func() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices in the graph: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.println("Enter edge " + (i + 1) + " details (source destination capacity): ");
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int capacity = scanner.nextInt();
            graph.addEdge(source, destination, capacity);
        }

        System.out.print("Enter the source vertex: ");
        int source = scanner.nextInt();
        System.out.print("Enter the sink vertex: ");
        int sink = scanner.nextInt();

        int maxFlow = graph.maxFlow(source, sink);
        System.out.println("The maximum flow in the graph is: " + maxFlow);
    }
}
