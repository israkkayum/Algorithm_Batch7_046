package com.mycompany.algorithm_final_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    private final int N = (int) (1e5 + 10);
    ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>(N);
    int[] vis = new int[N];

    Scanner s = new Scanner(System.in);
    
    public void bfs(int source){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = 1;
        
        while(!q.isEmpty()){
            int cur_v = q.peek();
            q.poll();
            
            System.out.print(cur_v +" ");
            
            Iterator<Integer> i = g.get(cur_v).listIterator();
            while(i.hasNext()){
                int child = i.next();
                if(vis[child] != 1){
                    q.add(child);
                    vis[child] = 1;
                }
            }
        }
    }

    public void bfs_graph() {
        int n = s.nextInt();
        
        for(int i = 0; i < N; ++i)
            g.add(new ArrayList<Integer>());
        
        for(int i = 0; i < n-1; ++i){
            int x = s.nextInt();
            int y = s.nextInt();
            
            g.get(x).add(y);
            g.get(y).add(x);
        }
        
        bfs(1);
    }

}
