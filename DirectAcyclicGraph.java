
package com.mycompany.algorithm_final_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

class DAG {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public DAG(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[vertices];
        boolean[] recursionStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && isCyclicUtil(i, visited, recursionStack)) {
                return true;
            }
        }

        return false;
    }

    private boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] recursionStack) {
        visited[vertex] = true;
        recursionStack[vertex] = true;

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                if (isCyclicUtil(neighbor, visited, recursionStack)) {
                    return true;
                }
            } else if (recursionStack[neighbor]) {
                return true;
            }
        }

        recursionStack[vertex] = false;
        return false;
    }
}


public class DirectAcyclicGraph {
    public void main_func(){
         Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number of vertices in the graph: ");
        int vertices = scanner.nextInt();
        DAG dag = new DAG(vertices);

        System.out.print(" Enter the number of edges: ");
        int edges = scanner.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print(" Enter edge " + (i + 1) + " (source destination): ");
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            dag.addEdge(source, destination);
        }

        boolean isCyclic = dag.isCyclic();

        if (isCyclic) {
            System.out.println(" The graph contains a cycle.");
        } else {
            System.out.println(" The graph is a Directed Acyclic Graph (DAG).");
        }
    }
}
