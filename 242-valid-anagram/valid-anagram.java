

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If the strings have different lengths, they can't be anagrams
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count the characters in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Subtract the character counts using string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false; // If the character is not in the map, they are not anagrams
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch); // Remove the character from the map if the count reaches zero
            }
        }
        
        // If the map is empty, they are anagrams
        return map.isEmpty();
    }
}
