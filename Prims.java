//package com.mycompany.algorithm_final_project;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
///**
// *
// * @author israkkayumchowdhury
// */
//
//class Graph {
//    private int vertices;
//    private List<List<Edge>> adjacencyList;
//
//    public Graph(int vertices) {
//        this.vertices = vertices;
//        adjacencyList = new ArrayList<>(vertices);
//        for (int i = 0; i < vertices; i++) {
//            adjacencyList.add(new ArrayList<>());
//        }
//    }
//
//    public void addEdge(int source, int destination, int weight) {
//        Edge edge = new Edge(source, destination, weight);
//        adjacencyList.get(source).add(edge);
//
//        // Since the graph is undirected, we add an edge from destination to source as well
//        edge = new Edge(destination, source, weight);
//        adjacencyList.get(destination).add(edge);
//    }
//
//    public void primMST() {
//        boolean[] visited = new boolean[vertices];
//        int[] parent = new int[vertices];
//        int[] key = new int[vertices];
//
//        Arrays.fill(visited, false);
//        Arrays.fill(key, Integer.MAX_VALUE);
//
//        // Create a priority queue to store vertices with their keys
//        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(vertices, new Node());
//
//        // Start with the first vertex
//        int startVertex = 0;
//        key[startVertex] = 0;
//        priorityQueue.add(new Node(startVertex, key[startVertex]));
//        parent[startVertex] = -1;
//
//        while (!priorityQueue.isEmpty()) {
//            int currentVertex = priorityQueue.poll().vertex;
//            visited[currentVertex] = true;
//
//            for (Edge edge : adjacencyList.get(currentVertex)) {
//                int destination = edge.destination;
//
//                if (!visited[destination] && edge.weight < key[destination]) {
//                    priorityQueue.remove(new Node(destination, key[destination]));
//
//                    key[destination] = edge.weight;
//                    priorityQueue.add(new Node(destination, key[destination]));
//                    parent[destination] = currentVertex;
//                }
//            }
//        }
//
//        printMST(parent);
//    }
//
//    private void printMST(int[] parent) {
//        System.out.println("Edge \tWeight");
//        for (int i = 1; i < vertices; i++) {
//            System.out.println(parent[i] + " - " + i + "\t" + getEdgeWeight(parent[i], i));
//        }
//    }
//
//    private int getEdgeWeight(int source, int destination) {
//        for (Edge edge : adjacencyList.get(source)) {
//            if (edge.destination == destination) {
//                return edge.weight;
//            }
//        }
//        return -1;
//    }
//
//    private class Edge {
//        int source;
//        int destination;
//        int weight;
//
//        Edge(int source, int destination, int weight) {
//            this.source = source;
//            this.destination = destination;
//            this.weight = weight;
//        }
//    }
//
//    private class Node implements Comparator<Node> {
//        int vertex;
//        int key;
//
//        Node() {
//        }
//
//        Node(int vertex, int key) {
//            this.vertex = vertex;
//            this.key = key;
//        }
//
//        @Override
//        public int compare(Node node1, Node node2) {
//            return Integer.compare(node1.key, node2.key);
//        }
//    }
//}
//
//public class Prims {
//    
//    public void main_func() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of vertices: ");
//        int vertices = scanner.nextInt();
//        Graph graph = new Graph(vertices);
//
//        System.out.print("Enter the number of edges: ");
//        int edges = scanner.nextInt();
//
//        for (int i = 0; i < edges; i++) {
//            System.out.println("Enter edge " + (i + 1) + " details (source destination weight): ");
//            int source = scanner.nextInt();
//            int destination = scanner.nextInt();
//            int weight = scanner.nextInt();
//            graph.addEdge(source, destination, weight);
//        }
//
//        graph.primMST();
//
//    }
//
//}
