import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            if(!hm.containsKey(x)){
                hm.put(x,1);
            }
            else hm.put(x,hm.get(x)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() 
        );

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll(); 
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = heap.poll().getKey();
        }

        return res;
    }
}
