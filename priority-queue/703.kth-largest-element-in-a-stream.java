/*
 * @lc app=leetcode id=703 lang=java
 *
 * [703] Kth Largest Element in a Stream
 */

// @lc code=start
class KthLargest {

    private java.util.PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.pq = new java.util.PriorityQueue<>(k + 1);
        this.k = k;
        for (int num : nums) {
            insert(num);
        }
    }

    public void insert(int num) {
        pq.add(num);
        if (pq.size() > k) {
            pq.poll();
        }
    }
    
    public int add(int val) {
        insert(val);
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end

