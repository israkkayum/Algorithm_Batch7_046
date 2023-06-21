package com.mycompany.algorithm_final_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author israkkayumchowdhury
 */

class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public List<Integer> topologicalSort() {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private void dfs(int vertex, boolean[] visited, Stack<Integer> stack) {
        visited[vertex] = true;

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, stack);
            }
        }

        stack.push(vertex);
    }
}

public class TopologicalSort {
    
    public void main_func(){
         Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number of vertices in the graph: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.print(" Enter the number of edges: ");
        int edges = scanner.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print(" Enter edge " + (i + 1) + " (source destination): ");
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        List<Integer> sortedVertices = graph.topologicalSort();

        System.out.println(" Topological Sort:");
        for (int vertex : sortedVertices) {
            System.out.print(vertex + " ");
        }
    }
}
