/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

// @lc code=start
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int v = getUnvisited(visited);
        int provinces = 0;
        while (v != -1) {
            dfs(isConnected, visited, v);
            provinces++;
            v = getUnvisited(visited);
        }
        return provinces;
    }

    public void dfs(int[][] G, boolean[] visited, int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        int[] adj = G[v];
        for (int i = 0; i < adj.length; i++) {
            if (adj[i] > 0) {
                dfs(G, visited, i);
            }
        }
    }

    public int getUnvisited(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

