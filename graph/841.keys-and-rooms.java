/*
 * @lc app=leetcode id=841 lang=java
 *
 * [841] Keys and Rooms
 */

// @lc code=start
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);
        return allvisited(visited);
    }

    public void dfs(List<List<Integer>> G, boolean[] visited, int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (Integer w : G.get(v)) {
            dfs(G, visited, w);
        }
    }

    public boolean allvisited(boolean[] visited) {
        for (boolean visit : visited) {
            if (visit == false) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

