class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            if (set.contains(n)) {
                return true; // Duplicate found
            }
            set.add(n);
        }
        
        return false; // No duplicates
    }
}