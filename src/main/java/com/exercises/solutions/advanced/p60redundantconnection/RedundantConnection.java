package com.exercises.solutions.advanced.p60redundantconnection;

public class RedundantConnection {
    // Union-Find: add edges one at a time. The first edge that connects
    // two nodes ALREADY in the same set is the redundant one, because it's
    // the one closing a cycle. Time ~O(n * alpha(n)), Space O(n).
    private int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) parent[i] = i;

        for (int[] edge : edges) {
            int rootA = find(edge[0]);
            int rootB = find(edge[1]);
            if (rootA == rootB) {
                return edge; // this edge closes a cycle
            }
            parent[rootA] = rootB;
        }
        return new int[0];
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }
}
