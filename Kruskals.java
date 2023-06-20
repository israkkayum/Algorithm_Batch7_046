package com.mycompany.algorithm_final_project;
import java.util.*;

public class Kruskals {
    
    static int[] parent;
    static int[] sz;
    
    public static void make(int v){
        parent[v] = v;
    }
    
    public static int find(int v){
        if(v == parent[v])
            return parent[v];
        
        // path compression
        return parent[v] = find(parent[v]);
    }
    
    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        
        if(a != b){
            // union by size
            if(sz[a] < sz[b])
                swap(a, b);
            
            parent[b] = a;
            sz[a] += sz[b];
        }
    
    }
    
     public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    
    public void main_func(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of (vertex, edges) => ");
        int n = s.nextInt();
        int m = s.nextInt();
        
        parent = new int[n+1];
        sz = new int[n+1];
        
        for(int i = 1; i <= n; i++)
            make(i);
        
        List<Pair<Integer, Pair<Integer, Integer>>> edges = new ArrayList<>();
        
        System.out.println("Enter edges & weight (u, v, wt) :");
        for(int i = 0; i < m; i++){
            int u = s.nextInt();
            int v = s.nextInt();
            int wt = s.nextInt();
          
            edges.add(new Pair<>(wt, new Pair<>(u, v)));
        }
        
        Collections.sort(edges);
        
        int total_cost = 0;
        
        for(Pair<Integer, Pair<Integer, Integer>> edge : edges){
            int wt = edge.getKey();
            int u = edge.getValue().getKey();
            int v = edge.getValue().getValue();
            
            if (find(u) == find(v)) continue;
            union(u, v);
            total_cost += wt;
            System.out.println(u + " " + v);
        }
        System.out.println(total_cost);
    }
}

// class for pair

class Pair<T, U> implements Comparable<Pair<T, U>>{
    private T first ;
    private U second;
    
    public Pair(T first, U second){
        this.first = first;
        this. second = second;
    }
    
    public T getKey(){
        return first;
    }
    
    public U getValue(){
        return second;
    }
    
     @Override
    public int compareTo(Pair<T, U> other) {
        return ((Comparable<T>) first).compareTo(other.first);
    }
}
