package com.mycompany.algorithm_final_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DFS {

    private final int N = (int) (1e5 + 10);
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(N);
    boolean[] vis = new boolean[N];

    public void dfs(int v) {
        System.out.println(v + " ");
        vis[v] = true;

        Iterator<Integer> i = adj.get(v).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            System.out.println("vertex " + v + ", child " + n);
            if (vis[n]) {
                continue;
            }
            dfs(n);
        }
    }

    public void dfs_graph() {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        for (int i = 0; i < N; ++i) {
            adj.add(new ArrayList<Integer>());
        }

        // add edge
        for (int i = 0; i < m; i++) {
            int x, y;
            x = s.nextInt();
            y = s.nextInt();

            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        // dfs
        for (int i = 1; i <= n; i++) {
            if (vis[i]) {
                continue;
            }
            dfs(i);
        }

    }

}
