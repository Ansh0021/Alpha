import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies using a HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        // Step 2: Use a PriorityQueue (min-heap) to keep the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // min-heap based on frequency
        );

        // Step 3: Add entries to the heap, maintaining the size of the heap to k
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll(); // remove the least frequent element
            }
        }

        // Step 4: Extract the top k elements from the heap and store them in an array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll().getKey();
        }

        return result;
    }
}
